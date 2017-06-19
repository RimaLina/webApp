package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by RimaLinaburgyte on 6/16/2017.
 */

@WebServlet(value = "/thirdServlet")
public class thirdServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String surname = req.getParameter("name");
        req.setAttribute("name", name);
        req.setAttribute("surname", surname);
        req.getRequestDispatcher("setcondPage.jsp").forward(req,resp);
    }
}
