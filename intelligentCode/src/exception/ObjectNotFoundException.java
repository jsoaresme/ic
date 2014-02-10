package exception;

public class ObjectNotFoundException extends Exception {	
	private final static long serialVersionUID = 1;
	
	public ObjectNotFoundException() {
	}

	public ObjectNotFoundException(String msg) {
		super(msg);
	}
}	