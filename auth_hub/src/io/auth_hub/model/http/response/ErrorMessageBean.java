package io.auth_hub.model.http.response;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;

@XmlRootElement(name = "ErrorMessageBean")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorMessageBean {
	protected String code;
	protected String message;
	public ErrorMessageBean() {}
	public ErrorMessageBean(String code, String message) {
		this.code = code;
		this.message = message;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
