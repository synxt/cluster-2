package in.synxt.exceptions;

public class ProfileCanNotBeLoaded extends Exception {

	public ProfileCanNotBeLoaded() {
		super();
	}

	public ProfileCanNotBeLoaded(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ProfileCanNotBeLoaded(String message, Throwable cause) {
		super(message, cause);
	}

	public ProfileCanNotBeLoaded(String message) {
		super(message);
	}

	public ProfileCanNotBeLoaded(Throwable cause) {
		super(cause);
	}

}
