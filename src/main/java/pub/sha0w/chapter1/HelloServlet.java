package pub.sha0w.chapter1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by coco1 on 2017/2/5.
 * 开始一段新的冒险
 */
//使用注解令我们可以拥有一个零配置的WEB.XML
@WebServlet("/hello")
public class HelloServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DateFormat dataFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = dataFormat.format(new Date());
        request.setAttribute("currentTime", currentTime);
        request.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(request, response);
    }
}
