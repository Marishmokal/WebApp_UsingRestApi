package pro.wings.exception;

public class TeacherNotPresentException extends Exception {

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg;

	public TeacherNotPresentException(String msg) {
		super(msg);
		
	}
	
}
