package com.github.security.component;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author yuzhuangzhuang
 * @create 2020/12/10 16:42
 */
@Component
public class RestAccessDeniedHandler implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest req, HttpServletResponse rep, AccessDeniedException e) throws IOException, ServletException {
        PrintWriter writer = rep.getWriter();
        writer.print("{\"message\":\"Forbidden\",\"code\":403}");
        writer.flush();
    }
}
