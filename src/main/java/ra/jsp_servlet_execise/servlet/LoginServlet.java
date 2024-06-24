package ra.jsp_servlet_execise.servlet;

import ra.jsp_servlet_execise.entity.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> listUsers = new ArrayList<>();
        User user1 = new User("admin", "admin", true);
        User user2 = new User("moderator", "moderator", false);
        User user3 = new User("user", "user", true);
        listUsers.add(user1);
        listUsers.add(user2);
        listUsers.add(user3);
        //1. Lấy userName và password
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        //2. Kiểm tra userName và password tồn tại trong listUsers và trạng thái phải là true
        boolean isLogin = false;
        for (User user : listUsers) {
            if (user.getUserName().equals(userName) && user.getPassword().equals(password) && user.isStatus()) {
                isLogin = true;
                break;
            }
        }
        if (isLogin) {
            request.getRequestDispatcher("views/loginSuccess.jsp").forward(request, response);
        } else {
            request.setAttribute("result","error");
            request.getRequestDispatcher("views/login.jsp").forward(request, response);
        }

    }
}
