import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class a extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String a =request.getParameter("a");
        String a2 =request.getParameter("b");
        String a3 =request.getParameter("c");
        System.out.println(a + "--" + a2 + "--" + a3 + "--");

    }
}
