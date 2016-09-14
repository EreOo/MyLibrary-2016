package ru.mylibrary.obj;

import java.util.Date;

/**
 * Created by Vladimir on 14.09.16.
 */
public class Author {
    private String fullname;
    private Date birthday;


    //конструкторы
    public Author() {
    }

    public Author(String fullname, Date birthday) {
        this.fullname = fullname;
        this.birthday = birthday;
    }

    //get & set
    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
