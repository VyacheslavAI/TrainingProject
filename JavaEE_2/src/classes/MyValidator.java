package classes;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import java.text.MessageFormat;

@FacesValidator("myValidator")
public class MyValidator implements Validator {

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        String validateString = value.toString();
        if (validateString.length() < 2) {
            String message = MessageFormat.format("{0} string should be larger 2 symbols", validateString);
            FacesMessage errorMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, message, message);
            throw new ValidatorException(errorMessage);
        }
    }
}
