package com.ksc;

import java.util.Date;

/**
 * Created by RimaLinaburgyte on 6/19/2017.
 */
public class studentMark {
    private String title;
    private int mark;
    private Date date;
    private int student_id;
    private int id;

    public studentMark(String title, int mark, Date date, int student_id, int id) {
        this.title = title;
        this.mark = mark;
        this.date = date;
        this.student_id = student_id;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public int getMark() {
        return mark;
    }

    public Date getDate() {
        return date;
    }

    public int getStudent_id() {
        return student_id;
    }

    public int getId() {
        return id;
    }
}
