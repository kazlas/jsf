package helloWorldJSF;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

public class HelloValidator implements Validator {
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {

		String helloMessage = (String) value;
		
		if (helloMessage.length() < 2) {
			FacesMessage message = new FacesMessage();
			message.setSeverity(FacesMessage.SEVERITY_ERROR);
			message.setSummary("Oooops! " +helloMessage+ " is incorrect");
			message.setDetail(helloMessage + " is too short");
			throw new ValidatorException(message);
		}
	}
}