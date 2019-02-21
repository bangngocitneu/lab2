import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet( urlPatterns = { "/order" })
public class OrderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>Đặt hàng</title></head>");
        writer.println("<body><h1>Đặt hàng</h1>");
        writer.println("<form method='post'>");
        writer.println("<table>");
        writer.println("<tr>");
        writer.println("<td>Họ tên:</td>");
        writer.println("<td><input name='name'/></td>");
        writer.println("</tr>");
        writer.println("<tr>");
        writer.println("<td>Địa chỉ:</td>");
        writer.println("<td><textarea name='address' cols='40' rows='5'></textarea></td>");
        writer.println("</tr>");
        writer.println("<tr>");
        writer.println("<td>Thành phố:</td>");
        writer.println("<td><select name='city'>");
        writer.println("<option>Hà Nội</option>");
        writer.println("<option>TP Hồ Chí Minh</option>");
        writer.println("</select></td>");
        writer.println("</tr>");
        writer.println("<tr>");
        writer.println("<td>Vận chuyển:</td>");
        writer.println("<td><input type='radio'  name='deliveryMethod' value='HanoiPost'/>Hà Nội Post");
        writer.println("<input type='radio' name='deliveryMethod' value='GiaoHangTietKiem'/>Giao Hàng Tiết Kiệm</td>");
        writer.println("</tr>");
        writer.println("<tr>");
        writer.println("<td>Ghi chú:</td>");
        writer.println("<td><textarea name='note' cols='40' rows='5'></textarea></td>");
        writer.println("</tr>");
        writer.println("<tr>");
        writer.println("<td>Đăng ký nhận bản tin:</td>");
        writer.println("<td><input type='checkbox' name='catalogRequest'/></td>");
        writer.println("</tr>");
        writer.println("<tr>");
        writer.println("<td>&nbsp;</td>");
        writer.println("<td><input type='reset' value = 'Nhập lại'/><input type='submit' value = 'Xác nhận'/></td>");
        writer.println("</tr>");
        writer.println("</table>");
        writer.println("</form>");
        writer.println("</body>");
        writer.println("</html>");

    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        req.setCharacterEncoding("UTF-8");
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>Đơn hàng</title></head>");
        writer.println("</head>");
        writer.println("<body><h1>Đơn hàng</h1>");
        writer.println("<table>");
        writer.println("<tr>");
        writer.println("<td>Họ tên:</td>");
        writer.println("<td>" + req.getParameter("name") + "</td>");
        writer.println("</tr>");
        writer.println("<tr>");
        writer.println("<td>Địa chỉ:</td>");
        writer.println("<td>" + req.getParameter("address") + "</td>");
        writer.println("</tr>");
        writer.println("<tr>");
        writer.println("<td>Thành phố:</td>");
        writer.println("<td>" + req.getParameter("city") + "</td>");
        writer.println("</tr>");
        writer.println("<tr>");
        writer.println("<td>Ghi chú:</td>");
        writer.println("<td>" + req.getParameter("note") + "</td>");
        writer.println("</td>");
        writer.println("</tr>");
        writer.println("<tr>");
    }
}
