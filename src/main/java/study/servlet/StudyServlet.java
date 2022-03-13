package study.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @program: javastudy
 * @description: study servelt
 * @author: Allen
 * @create: 2020-05-09 21:40
 **/

public class StudyServlet extends HttpServlet {

    private String message;
    @Override
    public void init() throws ServletException {
         message = "HellWorld";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        ServletInputStream inputStream = req.getInputStream();
        inputStream.read();
        // 实际的逻辑是在这里
        PrintWriter out = resp.getWriter();
        out.println("<h1>" + message + "</h1>");
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
