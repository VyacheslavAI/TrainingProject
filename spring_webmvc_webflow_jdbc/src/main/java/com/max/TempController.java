package com.max;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.SessionAttribute;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

@Controller
public class TempController {

    @GetMapping("/temp")
    public void getParams(Model model,
                          ServletRequest request,
                          ServletResponse response,
//                          OutputStream stream,
                          Writer writer,
                          @CookieValue("Idea-c24b4d65") String cookie,
                          @RequestHeader("User-Agent") String header
                          /*@SessionAttribute("") String attribute*/) throws IOException {
        response.getWriter().write("hello world from servlet<br/>");
        writer.write("hello from writer<br/>");
        writer.write(cookie + " <br/>");
        writer.write(header + " <br/>");
    }
}
