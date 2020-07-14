package br.com.petz.pedidos.exception;

public class CategoriaNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public CategoriaNotFoundException(Long id) {
        super("Categoria de id " + id + " não encontrada.");
    }

}