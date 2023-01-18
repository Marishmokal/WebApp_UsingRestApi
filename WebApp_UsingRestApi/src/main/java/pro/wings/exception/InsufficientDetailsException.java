package pro.wings.exception;

public class InsufficientDetailsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String message;

	public InsufficientDetailsException(String message) {
		super(message);
		
	}
	

}
