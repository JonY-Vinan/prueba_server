package pruebaServidor.factoria;

public class FabricaException extends RuntimeException {

	private static final long serialVersionUID = -5955401490509130465L;

	public FabricaException() {
		super();
	}

	public FabricaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public FabricaException(String message, Throwable cause) {
		super(message, cause);
	}

	public FabricaException(String message) {
		super(message);
	}

	public FabricaException(Throwable cause) {
		super(cause);
	}

}
