package in.synxt.exceptions;

public class NoPathFound extends Exception {

	public NoPathFound() {
		super();
	}

	public NoPathFound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public NoPathFound(String message, Throwable cause) {
		super(message, cause);
	}

	public NoPathFound(String message) {
		super(message);
	}

	public NoPathFound(Throwable cause) {
		super(cause);
	}

}
