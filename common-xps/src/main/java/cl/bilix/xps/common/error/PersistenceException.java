package cl.bilix.xps.common.error;

public class PersistenceException extends RuntimeException{
	
	private static final long serialVersionUID = 2834719797153380613L;

	public PersistenceException() {
        super();
    }

    public PersistenceException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public PersistenceException(final String message) {
        super(message);
    }

    public PersistenceException(final Throwable cause) {
        super(cause);
    }
}
