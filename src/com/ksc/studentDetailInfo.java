package com.ksc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RimaLinaburgyte on 6/19/2017.
 */
public class studentDetailInfo {

   private Student student;
   private List<studentAddress> studentAddresses= new ArrayList<>();
   private List<studentMark> studentMarks = new ArrayList<>();

    public studentDetailInfo(Student student, List<studentAddress> studentAddresses, List<studentMark> studentMarks) {
        this.student = student;
        this.studentAddresses = studentAddresses;
        this.studentMarks = studentMarks;
    }

    public Student getStudent() {
        return student;
    }

    public List<studentAddress> getStudentAddresses() {
        return studentAddresses;
    }

    public List<studentMark> getStudentMarks() {
        return studentMarks;
    }
}
