package servlets;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(value = "/auth", initParams = {@WebInitParam(name = "key", value = "value")})
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig config) {
        System.out.print("init filter, parameter - ");
        System.out.println(config.getInitParameter("key"));
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        res.getWriter().write("before ");
        if (true) {
            chain.doFilter(req, new MyResponseWrapper((HttpServletResponse) res));
        }

        res.getWriter().write(" after");
    }

    @Override
    public void destroy() {
        System.out.println("destroy filter");
    }
}

class MyResponseWrapper extends HttpServletResponseWrapper {

    private HttpServletResponse response;

    public MyResponseWrapper(HttpServletResponse response) {
        super(response);
        this.response = response;
    }

    @Override
    public PrintWriter getWriter() throws IOException {
        return new PrintWriter(response.getWriter()) {
            @Override
            public void write(String s) {
                s = s.replaceAll("Hello", "The Best");
                super.write(s);
                super.flush();
            }
        };
    }
}
