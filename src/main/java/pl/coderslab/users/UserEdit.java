package pl.coderslab.users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user/edit")
public class UserEdit extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        UserDAO userDao = new UserDAO();
        User user = new User();

        user.setId(Long.parseLong(request.getParameter("id")));
        user.setPassword(request.getParameter("userPassword"));
        user.setEmail(request.getParameter("userEmail"));
        user.setUserName(request.getParameter("userName"));
        userDao.updateUser(user);
//        try {
//            Class.forName("com.mysql.jdbc.Driver");

//        }catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
        response.sendRedirect("/user/list");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            UserDAO userDAO = new UserDAO();
            User user =userDAO.readUser(Long.parseLong(request.getParameter("id")));
            request.setAttribute("user", user);

        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        getServletContext().getRequestDispatcher("/edit.jsp")
                .forward(request, response);
    }
}
