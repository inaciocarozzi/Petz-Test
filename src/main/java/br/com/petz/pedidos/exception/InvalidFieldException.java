package br.com.petz.pedidos.exception;

public class InvalidFieldException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InvalidFieldException(String exceptionMessage) {
        super(exceptionMessage);
    }
}
