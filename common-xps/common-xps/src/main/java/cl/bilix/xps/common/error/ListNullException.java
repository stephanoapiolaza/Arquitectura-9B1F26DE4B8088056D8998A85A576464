package cl.bilix.xps.common.error;

public final class ListNullException extends RuntimeException {

	private static final long serialVersionUID = 2834719797153380613L;

	public ListNullException() {
        super();
    }

    public ListNullException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public ListNullException(final String message) {
        super(message);
    }

    public ListNullException(final Throwable cause) {
        super(cause);
    }

