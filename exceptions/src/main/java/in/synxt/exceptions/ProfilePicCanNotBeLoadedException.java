package in.synxt.exceptions;

public class ProfilePicCanNotBeLoadedException extends Exception {

	public ProfilePicCanNotBeLoadedException() {
		super();
	}

	public ProfilePicCanNotBeLoadedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ProfilePicCanNotBeLoadedException(String message, Throwable cause) {
		super(message, cause);
	}

	public ProfilePicCanNotBeLoadedException(String message) {
		super(message);
	}

	public ProfilePicCanNotBeLoadedException(Throwable cause) {
		super(cause);
	}

}
