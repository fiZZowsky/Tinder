package service;

import connection.DatabaseConnection;
import model.Model_Client;
import model.Model_Login;
import model.Model_Message;
import model.Model_Register;
import model.Model_User_Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceUser {

    public ServiceUser() {
        this.con = DatabaseConnection.getInstance().getConnection();
    }

    public Model_Message register(Model_Register data) {
        //  Check user exit
        Model_Message message = new Model_Message();
        try {
            PreparedStatement p = con.prepareStatement(CHECK_USER);
            p.setString(1, data.getUserName());
            ResultSet r = p.executeQuery();
            if (r.first()) {
                message.setAction(false);
                message.setMessage("User Already Exist");
            } else {
                message.setAction(true);
            }
            r.close();
            p.close();
            if (message.isAction()) {
                //  Insert User Register
                con.setAutoCommit(false);
                p = con.prepareStatement(INSERT_USER, PreparedStatement.RETURN_GENERATED_KEYS);
                p.setString(1, data.getName());
                p.setString(2, data.getSurname());
                p.setInt(3, data.getAge());
                p.setString(4, data.getCountry());
                p.setString(5, data.getUserName());
                p.setString(6, data.getPassword());
                p.execute();
                r = p.getGeneratedKeys();
                r.first();
                int userID = r.getInt(1);
                r.close();
                p.close();
                //  Create user account
                p = con.prepareStatement(INSERT_USER_ACCOUNT);
                p.setInt(1, userID);
                p.setString(2, data.getName());
                p.setString(3, data.getSurname());
                p.setInt(4, data.getAge());
                p.setString(5, data.getCountry());
                p.setString(6, data.getUserName());
                p.execute();
                p.close();
                con.commit();
                con.setAutoCommit(true);
                message.setAction(true);
                message.setMessage("Ok");
                message.setData(new Model_User_Account(userID, data.getName(), data.getSurname(), data.getAge(), data.getCountry(), data.getUserName(), "", "", true));
            }
        } catch (SQLException e) {
            message.setAction(false);
            message.setMessage("Server Error");
            try {
                if (con.getAutoCommit() == false) {
                    con.rollback();
                    con.setAutoCommit(true);
                }
            } catch (SQLException e1) {
            }
        }
        return message;
    }

    public Model_User_Account login(Model_Login login) throws SQLException {
        Model_User_Account data = null;
        PreparedStatement p = con.prepareStatement(LOGIN);
        p.setString(1, login.getUserName());
        p.setString(2, login.getPassword());
        ResultSet r = p.executeQuery();
        if (r.first()) {
            int userID = r.getInt(1);
            String name = r.getString(2);
            String surname = r.getString(3);
            int age = r.getInt(4);
            String country = r.getString(5);
            String userName = r.getString(6);
            String gender = r.getString(7);
            String image = r.getString(8);
            data = new Model_User_Account(userID, name, surname, age, country, userName, gender, image, true);
        }
        r.close();
        p.close();
        return data;
    }

    public List<Model_User_Account> getUser(int exitUser) throws SQLException {
        List<Model_User_Account> list = new ArrayList<>();
        PreparedStatement p = con.prepareStatement(SELECT_USER_ACCOUNT);
        p.setInt(1, exitUser);
        ResultSet r = p.executeQuery();
        while (r.next()) {
            int userID = r.getInt(1);
            String name = r.getString(2);
            String surname = r.getString(3);
            int age = r.getInt(4);
            String country = r.getString(5);
            String userName = r.getString(6);
            String gender = r.getString(7);
            String image = r.getString(8);
            list.add(new Model_User_Account(userID, name, surname, age, country, userName, gender, image, checkUserStatus(userID)));
        }
        r.close();
        p.close();
        return list;
    }

    private boolean checkUserStatus(int userID) {
        List<Model_Client> clients = Service.getInstance(null).getListClient();
        for (Model_Client c : clients) {
            if (c.getUser().getUserID() == userID) {
                return true;
            }
        }
        return false;
    }

    //  SQL
    private final String LOGIN = "select UserID, user_account.name, user_account.surname, user_account.age, user_account.country, user_account.UserName, Gender, ImageString from `user` join user_account using (UserID) where `user`.UserName=BINARY(?) and `user`.`Password`=BINARY(?) and user_account.`Status`='1'";
    private final String SELECT_USER_ACCOUNT = "select UserID, name, surname, age, country, UserName, Gender, ImageString from user_account where user_account.`Status`='1' and UserID<>?";
    private final String INSERT_USER = "insert into user (name, surname, age, country, UserName, `Password`) values (?,?,?,?,?,?)";
    private final String INSERT_USER_ACCOUNT = "insert into user_account (UserID, name, surname, age, country, UserName) values (?,?,?,?,?,?)";
    private final String CHECK_USER = "select UserID from user where UserName =? limit 1";
    //  Instance
    private final Connection con;
}
