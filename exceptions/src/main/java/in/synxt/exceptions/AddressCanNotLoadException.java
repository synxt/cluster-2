package in.synxt.exceptions;

public class AddressCanNotLoadException extends Exception {

	public AddressCanNotLoadException() {
		super();
	}

	public AddressCanNotLoadException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public AddressCanNotLoadException(String message, Throwable cause) {
		super(message, cause);
	}

	public AddressCanNotLoadException(String message) {
		super(message);
	}

	public AddressCanNotLoadException(Throwable cause) {
		super(cause);
	}

}
