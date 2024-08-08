import java.io.PrintWriter;
import javax.servlet.http.*;


public class FactorialServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        PrintWriter out = response.getWriter();
        int currentFactorial = 1;


        out.println("<html>");
        out.println("<head>");
        out.println("  <title>Factorial Table</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("  <table border='1'>");
        out.println("    <thead><td>Number</td><td>Factorial</td></thead>");
        out.println("    <tbody>");
        out.println("      <tr><td>"+0+"</td><td>"+1+"</td></tr>");
        for (int i = 1; i <= 10; i++) {
            currentFactorial *= i;
            out.println("      <tr><td>"+i+"</td><td>"+currentFactorial+"</td></tr>");
        }
        out.println("    </tbody>");
        out.println("  </table>");
        out.println("</body>");
        out.println("</html>");
    }
}
