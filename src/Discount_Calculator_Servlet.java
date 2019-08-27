import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.PrimitiveIterator;

@WebServlet(name = "Discount_Calculator_Servlet", urlPatterns = "/calculate discount")
public class Discount_Calculator_Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String description = request.getParameter("product description");
    float price = Float.parseFloat(request.getParameter("price"));
    float discountPercent= Float.parseFloat(request.getParameter("discount percent"));
    float discountAmount = price*discountPercent/100;
    float discountPrice = price-discountAmount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/Style.css\">\n");
        writer.println("<div id= 'Discount'>");
        writer.println("<h1> Product Discount Calculator</h1>");
        writer.println("<br>");
        writer.println("Product Description: "+ description);
        writer.println("<br>");
        writer.println("Price list:  $"+ price);
        writer.println("<br>");
        writer.println("Discount percent:  %"+ discountPercent);
        writer.println("<br>");
        writer.println("Discount Amount:  $"+ discountAmount);
        writer.println("<br>");
        writer.println("Discount price:  $"+ discountPrice);
        writer.println("</div>");

        writer.println("</html>");


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
