package connection;

import java.sql.Connection;
import java.sql.SQLException;
/**
 * 
 * Funkcja łącząca z baza danych
 */
public class DatabaseConnection {

    private static DatabaseConnection instance;
    private Connection connection;
/**
 * Pobiera instancje
 * @return instance
 */
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    private DatabaseConnection() {

    }
/**
 * Łączy sie z baza danych
 * @throws SQLException 
 */
    public void connectToDatabase() throws SQLException {
        String server = "localhost";
        String port = "3306";
        String database = "database";
        String userName = "root";
        String password = "";
        connection = java.sql.DriverManager.getConnection("jdbc:mysql://localhost/users", "root", "");
    }
/**
 * Pobiera połączenie
 * @return connection
 */
    public Connection getConnection() {
        return connection;
    }
/**
 * Ustawia połączenie
 * @param connection pobiera ustawienia połączenia
 */
    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
