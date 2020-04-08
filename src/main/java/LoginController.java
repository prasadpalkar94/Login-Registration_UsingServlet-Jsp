import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
       description = "Login Servlet Testing",
        urlPatterns = {"/LoginController"},
        initParams = {
                @WebInitParam(name = "user",value = "Prasad15"),
                @WebInitParam(name = "pwd",value = "prasad@1508")
        }
)
public class LoginController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");

        String userId = getServletConfig().getInitParameter("user");
        String passwordId = getServletConfig().getInitParameter("pwd");

        if(userId.equals(userName) && passwordId.equals(password)){
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
