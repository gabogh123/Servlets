

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/AutoRefresh"})
public class AutoRefresh extends HttpServlet {


        
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setIntHeader("refresh",-1);
        response.setContentType("text/html;charset-UTF-8");
        PrintWriter out = response.getWriter();
        Calendar cal = new GregorianCalendar();
        String noon;
        int hour = cal.get(Calendar.HOUR);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        if(cal.get(Calendar.AM_PM)==0)
            noon = "AM";
        else
            noon = "PM";
        
        String ct = hour + ":" + minute+":"+second+" "+noon; 
        
        out.println("<!DOCTYPE  html");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet Refresh</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<center><h2>Current Time:" +ct+"</h2></center>");
        out.println("</body>");
        out.println("</html>");
        
    }

}
