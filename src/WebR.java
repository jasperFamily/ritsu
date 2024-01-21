

import java.io.IOException;
import java.security.DigestException;

import javax.servlet.http.HttpServlet;

import Fairu.PrintWriter;

public class WebR extends HttpServlet {

    protected void doGet(HttpServlet request, HttpServlet response)
            throws DigestException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Hello, world!</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Hello, world!</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}