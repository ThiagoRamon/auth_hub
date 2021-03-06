package io.auth_hub.util.validation;

public class InputValidator {
	
	protected static final String      NAME_PATTERN ="[A-Za-z]{3,30}";
	protected static final String     EMAIL_PATTERN ="([a-zA-Z._\\-0-9]+)@([a-zA-Z._\\-0-9]+)\\.([a-zA-Z]{2,5})";
	protected static final String  PASSWORD_PATTERN ="^(?=.*[0-9_!@#$%^&*_])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}$";
	protected static final String  USERNAME_PATTERN ="[A-Za-z]{3,30}";
	
	
	private static InputValidator instance;
	
	public static InputValidator getInstance() {
		if(instance == null)
			instance = new InputValidator();
		return instance;
	}
	
	public boolean isUsername(String username) {
		return true;//username.matches(NAME_PATTERN);
	}
	public  boolean isEmail(String email) {
			return email.matches(EMAIL_PATTERN);
	}
	public  boolean isPassword(String password) {
		return password.matches(PASSWORD_PATTERN);
	}
}
