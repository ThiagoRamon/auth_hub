package io.auth_hub.model.http.response;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;

@XmlRootElement(name = "HttpResponse")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HttpResponseBean {
	public Integer    code;
	public String menssage;
	public Object header;
	public Object body;
	
	public HttpResponseBean(Object data) {
		this.body = data;
	}
	public HttpResponseBean(int code, String message, Object data) {
		this.code     = code;
		this.menssage = message;
		this.body     = data;
	}
	public HttpResponseBean(int code, String message,Object header, Object data) {
		this.code     = code;
		this.menssage = message;
		this.body     = data;
	}
	/*private static  HttpResponse instance;
	public static HttpResponse getInstance(Object) {
		return (instance!=null ? instance: new HttpResponse());
	}
	
	public */
}
