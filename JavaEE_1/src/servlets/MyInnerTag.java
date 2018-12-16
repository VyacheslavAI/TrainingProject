package servlets;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class MyInnerTag extends SimpleTagSupport {

    @Override
    public void doTag() throws JspException, IOException {
        getJspContext().getOut().write("<br/>inner hello world<br/>");
        MyTagDescriptor ancestorWithClass = (MyTagDescriptor) findAncestorWithClass(this, MyTagDescriptor.class);
        getJspContext().getOut().write(ancestorWithClass.getName() + "<br/>");
    }
}
