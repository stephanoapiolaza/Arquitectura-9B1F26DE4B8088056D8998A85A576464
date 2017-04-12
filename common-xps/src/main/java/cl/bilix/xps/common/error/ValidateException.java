package cl.bilix.xps.common.error;

public class ValidateException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public ValidateException() {
        super();
    }

    public ValidateException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public ValidateException(final String message) {
        super(message);
    }

    public ValidateException(final Throwable cause) {
        super(cause);
    }
}
