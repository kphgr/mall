package com.github.security.component;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author yuzhuangzhuang
 * @create 2020/12/10 16:29
 */
@Component
public class RestAuthenticationEntryPoint implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest req, HttpServletResponse rep, AuthenticationException e) throws IOException, ServletException {
        PrintWriter writer = rep.getWriter();
        writer.print("{\"message\":\"Unauthorized\",\"code\":401}");
        writer.flush();
    }
}
