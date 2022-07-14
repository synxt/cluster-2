package in.synxt.exceptions;

public class EmailCanNotLoadException extends Exception {

	public EmailCanNotLoadException() {
		super();
	}

	public EmailCanNotLoadException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public EmailCanNotLoadException(String message, Throwable cause) {
		super(message, cause);
	}

	public EmailCanNotLoadException(String message) {
		super(message);
	}

	public EmailCanNotLoadException(Throwable cause) {
		super(cause);
	}

}
