package study.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @program: javastudy
 * @description: running
 * @author: Allen
 * @create: 2020-05-09 22:04
 **/

public class Start extends HttpServlet {
    private String message;

    @Override
    public void init() throws ServletException {
        message = "running";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        // 实际的逻辑是在这里
        PrintWriter out = resp.getWriter();
        out.println("<h1>" + message + "</h1>");
    }

}
