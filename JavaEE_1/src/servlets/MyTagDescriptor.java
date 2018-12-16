package servlets;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.io.StringWriter;

public class MyTagDescriptor extends SimpleTagSupport {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void doTag() throws JspException, IOException {
        getJspContext().setAttribute("two", "three");
        getJspContext().getOut().write("hello world<br/>");
        JspWriter writer = getJspContext().getOut();
        StringWriter sw = new StringWriter();
        getJspBody().invoke(sw);

        writer.write("<b>");
        writer.write(sw.toString());
        writer.write("<b/>");
        writer.write("<br/>");
        writer.write(name);
        writer.write("<br/>");
    }


}
