import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

@WebServlet("/DynamischePagina")
public class EersteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html lang='en'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>index</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Random</h1>");
        int random = new Random().nextInt(50);
        out.println("<p><a id='home' href='index.html'>Home</a></p>");
        out.println("<p id='dynamisch'> Je getal is: " + random + ".</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
