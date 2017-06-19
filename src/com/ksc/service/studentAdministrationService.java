package com.ksc.service;

import com.ksc.JdbsUtils.JdbsUtils;
import com.ksc.Student;
import com.ksc.studentAddress;
import com.ksc.studentDetailInfo;
import com.ksc.studentMark;
import com.sun.istack.internal.Nullable;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by RimaLinaburgyte on 6/16/2017.
 */
public class studentAdministrationService {

    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        @Nullable
        Connection connection = JdbsUtils.getConnection();

        if (connection!=null){
            try {
                Statement st =connection.createStatement();
                ResultSet resultSet = st.executeQuery("select * from students");
                while(resultSet.next()){
                    students.add(new Student(resultSet.getInt("id"),resultSet.getString("name"),
                            resultSet.getString("surname"), resultSet.getString("phone"), resultSet.getString("email")));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return students;
    }

    public studentDetailInfo getStudentDetailInfo(int studentId){
        Student student = getStudent(studentId);

        List<studentAddress> addresses = getStudentAddresses(studentId);

        List<studentMark> marks = getStudentMarks(studentId);

        studentDetailInfo studentDetailInfo = new studentDetailInfo(student,addresses,marks);

        return studentDetailInfo;

    }

    public Student getStudent(int studentId){
        Connection connection = JdbsUtils.getConnection();
        Student student = new Student();
        if (connection!=null){
            try {
                Statement st = connection.createStatement();
                ResultSet resultSet = st.executeQuery("select * from students where id =" + studentId);
                resultSet.next();
                student = new Student(resultSet.getInt("id"), resultSet.getString("name"),
                        resultSet.getString("surname"), resultSet.getString("phone"),
                        resultSet.getString("email"));
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return student;
    }


    public List<studentAddress> getStudentAddresses(int studentId){
        List<studentAddress> addresses = new ArrayList();
        Connection connection = JdbsUtils.getConnection();
        if(connection!=null){
            try {
                Statement st = connection.createStatement();
                ResultSet resultSet = st.executeQuery("select * from student_adress where student_id=" + studentId);
                while(resultSet.next()) {
                    addresses.add(new studentAddress(resultSet.getInt("student_id"), resultSet.getInt("id"),
                            resultSet.getString("country"), resultSet.getString("city"), resultSet.getString("street"), resultSet.getString("post_code")));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return addresses;

    }


    public List<studentMark> getStudentMarks(int studentId){
        List<studentMark> marks = new ArrayList<>();

        Connection connection = JdbsUtils.getConnection();
        if (connection!=null){
            try {
                Statement st = connection.createStatement();
                ResultSet resultSet = st.executeQuery("select * from student_marks where student_id="+studentId);
                while(resultSet.next()) {
                    marks.add(new studentMark(resultSet.getString("title"), resultSet.getInt("mark"),
                            resultSet.getDate("time_stamp"),resultSet.getInt("student_id"),resultSet.getInt("id")));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }


        }
        return marks;
    }


}
