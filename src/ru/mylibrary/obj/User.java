package ru.mylibrary.obj;

/**
 * Created by Vladimir on 14.09.16.
 */
public class User {

    private String username;
    private String password;

    //конструкторы
    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }


    //get & set
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
