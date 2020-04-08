import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RegistrationController extends HttpServlet {
    public static final String FirstName_Pattern = "^[A-Z]{1}[A-Za-z]{3,}$";
    public static final String LastName_Pattern  = "^[A-Z]{1}[A-Za-z]{3,}$";
    public static final String Email_Pattern = "^[a-zA-Z]*[-./+]?[0-9]*[@]{1}[a-z0-9]*[.]{1}[a-z]{3}[.]{1}[a-z]{3}$";
    public static final String ContactNo_Pattern = "^[0-9]{2}[[:space:]][0-9]{10}$";
    public static final String UserName_Pattern = "^[A-Z]{1}[a-z0-9@#$]{2,}$";
    public static final String Password_Pattern = "((?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,})";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String firstName = request.getParameter("fname");
        String lastName = request.getParameter("lname");
        String email = request.getParameter("email");
        String mobileNo = request.getParameter("mobileNo");
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");

        boolean FirstName = userName.matches(FirstName_Pattern);
        boolean LastName = userName.matches(LastName_Pattern);
        boolean Email = userName.matches(Email_Pattern);
        boolean ContactNo = userName.matches(ContactNo_Pattern);
        boolean UserName = userName.matches(UserName_Pattern);
        boolean Password = userName.matches(Password_Pattern);

        if(FirstName && LastName && Email && ContactNo && UserName && Password){
            request.setAttribute("userName",userName);
            request.getRequestDispatcher("registrationSuccess.jsp").forward(request,response);
        }else{
            RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/registration.jsp");
            PrintWriter out = response.getWriter();
            out.println("<font color=red>Enter Valid Username OR Password.</font>");
            requestDispatcher.include(request,response);
        }


    }
}
