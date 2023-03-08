package dat.intranet;

import dat.intranet.entities.User;
import dat.intranet.persistence.UserMapper;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {

    public void init(){
        UserMapper.populateUserMap();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Først modtager vi requestværdier fra en input form
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        // TODO: Tjek at login + password findes i systemet (DB)
        if(UserMapper.isLoginValid(login,password)){
            request.setAttribute("message","Login : " + login + " is valid");
            User user = UserMapper.getUserByLogin(login);
            // Todo: Gem user i sesson-state
            HttpSession session = request.getSession();
            session.setAttribute("user",user);

        } else {
            request.setAttribute("message","Login : " + login + " or password is invalid");
        }

        // Forward til index.jsp siden
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
