package cl.bilix.xps.common.error;

public class XpsException extends RuntimeException{

	private static final long serialVersionUID = 2834719797153380613L;

	public XpsException() {
        super();
    }

    public XpsException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public XpsException(final String message) {
        super(message);
    }

    public XpsException(final Throwable cause) {
        super(cause);
    }

}
