import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
    public static final String Name_Pattern = "^[A-Z]{1}[a-z]{2,}$";
    public static final String Password_Pattern = "((?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,})";
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");


        if(userName.matches(Name_Pattern) && password.equals(Password_Pattern)){
            request.setAttribute("userName",userName);
            request.getRequestDispatcher("loginSuccess.jsp").forward(request,response);
        }else{
            RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/login.jsp");
            PrintWriter out = response.getWriter();
            out.println("<font color=red>Enter Valid Username OR Password.</font>");
            requestDispatcher.include(request,response);
        }
    }
}
