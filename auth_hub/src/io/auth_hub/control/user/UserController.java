package io.auth_hub.control.user;

import java.util.HashMap;
import java.util.Map;

import io.auth_hub.model.user.UserBean;
import io.auth_hub.util.http.HttpResponse;
import io.auth_hub.util.userInput.InputValidator;

public class UserController {
	
	private UserBean userBean;
	
	public Object addUser(String username, String email, String password)throws Exception {
		Map<String, Object> responseList = new HashMap<String, Object>();
		
		if(InputValidator.getInstance().isNotUsername(username))
			return new HttpResponse("name is not valid");
		if(InputValidator.getInstance().isNotEmail(email))
			return "email is not valid";
		if(InputValidator.getInstance().isNotPassword(password))
			return "password is not valid";
			
		userBean = new UserBean(username, email, password);
		responseList.put("User", userBean);
		return new HttpResponse(responseList);
	}
}
