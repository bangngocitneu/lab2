

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@WebServlet( urlPatterns = { "/add" })
public class addServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws  ServletException,IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>Phép toán</title>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<h1>thực hiện phép tính</h1>");
        writer.println("<form method = 'post'>");
        writer.println("<table style = width: 400px>");

        writer.println("<tr>");
        writer.println("<td> <input name='number1'/> </td>");
        writer.println("<td><select name ='oparator'>");
        writer.println("<option value = 'cong'>+</option>");
        writer.println("<option value = 'tru'>-</option>");
        writer.println("<option value = 'nhan'>*</option>");
        writer.println("<option value = 'chia'>/</option>");
        writer.println("</select></td>");
        writer.println("<td><input name='number2'/></td>");

        writer.println("<td><input type='submit' value='thực hiện'>");
        writer.println("</td>");
        writer.println("</tr>");
        writer.println("</table>");
        writer.println("</form>");
        writer.println("</body>");
        writer.println("</html>");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset = UTF-8");

        PrintWriter writer = resp.getWriter();
        int result =0;
        String handle = req.getParameter("oparator");
        if ( handle.equalsIgnoreCase("cong")){
            result = Integer.parseInt(req.getParameter("number1"))  + Integer.parseInt(req.getParameter("number2"));
        }if (handle.equalsIgnoreCase("tru")){
            result = Integer.parseInt(req.getParameter("number1"))  - Integer.parseInt(req.getParameter("number2"));
        }if (handle.equalsIgnoreCase("nhan")){
            result = Integer.parseInt(req.getParameter("number1"))  * Integer.parseInt(req.getParameter("number2"));
        }if (handle.equalsIgnoreCase("chia")){
            result = Integer.parseInt(req.getParameter("number1"))  / Integer.parseInt(req.getParameter("number2"));
        }
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title></title>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<h1>Kết Quả</h1>");
        writer.println("<h2>"+ result +"</h2>");
        req.setAttribute("result",result);
        writer.println("</body>");
        writer.println("</html>");
    }
//

}