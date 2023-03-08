package dat.intranet;

import dat.intranet.entities.Student;
import dat.intranet.entities.User;
import dat.intranet.persistence.StudentMapper;
import dat.intranet.persistence.UserMapper;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ClassListServlet", value = "/classlist")
public class ClassListServlet extends HttpServlet {

    public void init(){
        StudentMapper.populateStudents();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // vær sikker på at brugeren logget på - eller forward til index.jsp
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        if(user != null){
            request.getRequestDispatcher("index.jsp").forward(request,response);
        }else{

        }
        // Ellers indlæs en arrayliste med klassens studerende
        List<Student> studentList = StudentMapper.getAllStudents();
        request.setAttribute("studentlist",studentList);

        // Forward til /WEB-INF/classlist.jsp
        request.getRequestDispatcher("WEB-INF/classlist.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
