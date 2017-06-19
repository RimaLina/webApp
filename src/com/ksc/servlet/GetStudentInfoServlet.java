package com.ksc.servlet;

import com.ksc.service.studentAdministrationService;
import com.ksc.studentDetailInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by RimaLinaburgyte on 6/19/2017.
 */
@WebServlet (value = "/getStudentDetailInfo")
public class GetStudentInfoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.valueOf(req.getParameter("id"));

        studentAdministrationService service = new studentAdministrationService();

        req.setAttribute("studentDetailInfo",service.getStudentDetailInfo(id));
        req.getRequestDispatcher("studentInfo.jsp").forward(req,resp);


    }
}
