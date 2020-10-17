package pl.coderslab.users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user/Add")
public class UserAdd extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        User user = new User();
//
//        user.setUserName(request.getParameter("userName"));
//
//        user.setEmail(request.getParameter("userEmail"));
//
//        user.setPassword(request.getParameter("userPassword"));

        UserDAO userDao = new UserDAO ();

        userDao.createUser(request.getParameter("userEmail"),request.getParameter("userName"),request.getParameter("userPassword"));

        response.sendRedirect(request.getContextPath() + "/user/list");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/add.jsp")
                .forward(request, response);


    }
}
