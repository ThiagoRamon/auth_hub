package io.auth_hub.util.userInput;

public class InputValidator {
	
	private static InputValidator instance;
	public static InputValidator getInstance() {
		if(instance == null)
			instance = new InputValidator();
		return instance;
	}
	
	public boolean isNotUsername(String username) {
		
		return false;
	}
	public  boolean isNotEmail(String email) {
			
			return false;
		}
	public  boolean isNotPassword(String password) {
		
		return false;
	}
}
