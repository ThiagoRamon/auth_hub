package io.auth_hub.model.consumer.application;

import java.util.List;

import io.auth_hub.model.core.EntityBean;

public class ApplicationBean extends EntityBean {
	
	private String name;
	private String domain;
	private String token;
	private String description;
	private List<UserApplicationBean> users;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<UserApplicationBean> getUsers() {
		return users;
	}
	public void setUsers(List<UserApplicationBean> users) {
		this.users = users;
	}
	
}
