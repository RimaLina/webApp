package com.ksc;

/**
 * Created by RimaLinaburgyte on 6/19/2017.
 */
public class studentAddress {
    private int student_id;
    private int id;
    private String country;
    private String city;
    private String street;
    private String post_code;

    public studentAddress(int student_id, int id, String country, String city, String street, String post_code) {
        this.student_id = student_id;
        this.id = id;
        this.country = country;
        this.city = city;
        this.street = street;
        this.post_code = post_code;
    }

    public int getStudent_id() {
        return student_id;
    }

    public int getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getPost_code() {
        return post_code;
    }
}
