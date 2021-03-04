package io.auth_hub.model.user;


import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;

import io.auth_hub.model.core.EntityBean;
import io.auth_hub.model.core.SituationBean;
import io.auth_hub.model.core.TypeBean;
import io.auth_hub.model.util.UtilBean;


@XmlRootElement(name = "UserBean")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserBean extends EntityBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6923784397387936769L;
	private String username;
	private String email;
	private PasscodeBean  passcode;
	private SituationBean situation;
	private TypeBean 	  type;
	public UserBean() {}
	public UserBean(String username, String email, String password) {
		this.username = username;
		this.email    = email;
		this.passcode = new PasscodeBean(password);
	}
	public UserBean(String id,String username, String email, String password) {
		this.id       = id;
		this.username = username;
		this.email    = email;
		this.passcode = new PasscodeBean(password);
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public PasscodeBean getPasscode() {
		return passcode;
	}
	public void setPasscode(PasscodeBean passcode) {
		this.passcode = passcode;
	}
	
	
	
	public SituationBean getSituation() {
		return situation;
	}
	public void setSituation(SituationBean situation) {
		this.situation = situation;
	}
	public TypeBean getType() {
		return type;
	}
	public void setType(TypeBean type) {
		this.type = type;
	}
	@Override
	public String toString() {
		//new UtilBean();
		return "UserBean [id="+  UtilBean.getHashFromString(getId().toString(), "SHA-1") +", username=" + username + ", email=" + email + ", password=" + passcode.getCode() + "]";
	}
	public String toJson() {
		//new UtilBean();
		return "{user:{id:"+  UtilBean.getHashFromString(getId().toString(), "SHA-1") +", username:" + username + ", email:" + email + ", password:" + passcode.getCode() + "}}";
	}
	
	
	
}
