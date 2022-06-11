package model;

public class Model_Register {
    
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
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Model_Register(String name, String surname, int age, String country, String userName, String password) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.country = country;
        this.userName = userName;
        this.password = password;
    }

    public Model_Register() {
    }
    
    private String name;
    private String surname;
    private int age;
    private String country;
    private String userName;
    private String password;
}
