package pl.coderslab.users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user/list")
public class UserList extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            UserDAO userDao = new UserDAO();
            request.setAttribute("users", userDao.findAll());


        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        getServletContext().getRequestDispatcher("/list.jsp")
                .forward(request, response);
    }
}
