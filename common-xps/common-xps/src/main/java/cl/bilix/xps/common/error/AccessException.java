package cl.bilix.xps.common.error;

public final class AccessException extends RuntimeException {

	private static final long serialVersionUID = 2834719797153380613L;

	public AccessException() {
        super();
    }

    public AccessException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public AccessException(final String message) {
        super(message);
    }

    public AccessException(final Throwable cause) {
        super(cause);
    }

}
