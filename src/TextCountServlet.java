import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/text")
public class TextCountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String text = request.getParameter("text");

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        writer.println(String.format("<p> %s </p><br/>", text));
        writer.println(String.format("<h1>Ilość słów: %d</h1><br/>", TextStatisticsUtils.numberOfWords(text)));
        writer.println(String.format("<h1>Ilość znaków: %d</h1><br/>", TextStatisticsUtils.numberOfAllChars(text)));
        writer.println(String.format("<h1>Ilość znaków (bez spacji): %d</h1><br/>", TextStatisticsUtils.numberOfChars(text)));
        writer.println(String.format("<h1>Palindrom: %s</h1><br/>", TextStatisticsUtils.isPalindrom(text)));
    }
}
