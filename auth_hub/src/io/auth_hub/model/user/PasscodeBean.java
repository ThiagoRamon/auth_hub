package io.auth_hub.model.user;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

//import javax.xml.bind.annotation.XmlRootElement;

import io.auth_hub.model.core.EntityBean;
import io.auth_hub.model.core.SituationBean;
//@XmlRootElement(name="password")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PasscodeBean extends EntityBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5684051696887755750L;
	private String code;
	private SituationBean situation;
	public PasscodeBean() {}
	public PasscodeBean(String code) {
		this.code = code;
	}
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public SituationBean getSituation() {
		return situation;
	}

	public void setSituation(SituationBean situation) {
		this.situation = situation;
	}
	
}
