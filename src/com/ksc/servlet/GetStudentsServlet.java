package com.ksc.servlet;

import com.ksc.Student;
import com.ksc.service.studentAdministrationService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by RimaLinaburgyte on 6/16/2017.
 */
@WebServlet(value = "/getStudents")
public class GetStudentsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        studentAdministrationService service = new studentAdministrationService();
        List<Student> students = service.getStudents();

        req.setAttribute("students", students);
        req.getRequestDispatcher("students.jsp").forward(req,resp);
    }
}
