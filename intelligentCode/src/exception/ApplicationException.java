package exception;

public class ApplicationException extends Exception {
	
private final static long serialVersionUID = 1;
	
	public ApplicationException() {
		super();
	}

	public ApplicationException(String msg) {
		super(msg);
	}

	public ApplicationException(Exception e) {
		super(e);
	}

}
