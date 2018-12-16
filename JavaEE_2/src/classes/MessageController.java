package classes;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class MessageController {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private FacesContext context = FacesContext.getCurrentInstance();

    public void doJob() {
        if (message.equals("error")) {
            context.addMessage("message", new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    "empty message", "message was empty"));
        }
    }
}
