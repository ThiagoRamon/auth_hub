package io.auth_hub.model.consumer.application;

import io.auth_hub.model.core.EntityBean;
import io.auth_hub.model.user.UserBean;

public class UserApplicationBean extends EntityBean {
	
	private UserBean user;
	private ApplicationBean application;
	public UserBean getUser() {
		return user;
	}
	public void setUser(UserBean user) {
		this.user = user;
	}
	public ApplicationBean getApplication() {
		return application;
	}
	public void setApplication(ApplicationBean application) {
		this.application = application;
	}
	
	
	
}
