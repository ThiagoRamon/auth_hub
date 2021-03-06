package io.auth_hub.control.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.auth_hub.model.core.ErrorMessageBean;
import io.auth_hub.model.http.response.HttpResponseBean;
import io.auth_hub.model.user.UserBean;
import io.auth_hub.model.util.UtilBean;
import io.auth_hub.util.validation.InputValidator;
public class UserController {
	
	private UserBean userBean;
	
	public Object addUser(String username, String email, String password)throws Exception {
		
		Map<String, Object> responseList = new HashMap<String, Object>();
		List<ErrorMessageBean> errosList = new ArrayList<ErrorMessageBean>();
		
		if(!InputValidator.getInstance().isUsername(username))
			errosList.add(new ErrorMessageBean(null, "Username is not valid") );
		
		if(!InputValidator.getInstance().isEmail(email))
			errosList.add(new ErrorMessageBean(null, "Email is not valid") );
		
		if(!InputValidator.getInstance().isPassword(password))
			errosList.add(new ErrorMessageBean(null, "Password is not valid") );
			
		if(!errosList.isEmpty()) {
		
			responseList.put("Error", errosList);
			return new HttpResponseBean(responseList);
		
		}
		
		
		userBean = new UserBean();
		responseList.put("token", UtilBean.getHashFromString("abc", "SHA-512"));
		responseList.put("User", userBean);
		return new HttpResponseBean(responseList);
	}
}
