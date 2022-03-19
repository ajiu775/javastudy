package study.net;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: java study
 * @description: parser httpServletRequest
 * @author: Allen
 * @create: 2020-11-02 13:52
 **/

public class Request {
    public void parserRequest(HttpServletRequest request) {
        String contentType = request.getContentType();
    }
}
