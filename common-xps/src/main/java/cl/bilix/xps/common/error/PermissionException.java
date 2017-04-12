package cl.bilix.xps.common.error;

public class PermissionException extends RuntimeException{
	private static final long serialVersionUID = 2834719797153380613L;

	public PermissionException() {
        super();
    }

    public PermissionException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public PermissionException(final String message) {
        super(message);
    }

    public PermissionException(final Throwable cause) {
        super(cause);
    }

}
