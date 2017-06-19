package com.ksc;

/**
 * Created by RimaLinaburgyte on 6/16/2017.
 */
public class Student {
    private int id;
    private String name;
    private String Surname;
    private String phone;
    private String email;

    public Student(int id, String name, String surname, String phone, String email) {
        this.id = id;
        this.name = name;
        Surname = surname;
        this.phone = phone;
        this.email = email;
    }

    public Student(){}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return Surname;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
