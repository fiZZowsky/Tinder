package model;

public class Model_User_Account {

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getSurname() {
        return surname;
    }
    
    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getCountry() {
        return country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Model_User_Account(int userID, String name, String surname, int age, String country, String userName, String gender, String image, boolean status) {
        this.userID = userID;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.country = country;
        this.userName = userName;
        this.gender = gender;
        this.image = image;
        this.status = status;
    }

    public Model_User_Account() {
    }

    private int userID;
    private String name;
    private String surname;
    private int age;
    private String country;
    private String userName;
    private String gender;
    private String image;
    private boolean status;
}
