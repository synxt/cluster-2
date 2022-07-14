package in.synxt.exceptions;

public class NoPicFound extends Exception {

	public NoPicFound() {
		super();
	}

	public NoPicFound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public NoPicFound(String message, Throwable cause) {
		super(message, cause);
	}

	public NoPicFound(String message) {
		super(message);
	}

	public NoPicFound(Throwable cause) {
		super(cause);
	}

}
