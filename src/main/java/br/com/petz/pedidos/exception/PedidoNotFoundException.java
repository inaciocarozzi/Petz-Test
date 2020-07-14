package br.com.petz.pedidos.exception;

public class PedidoNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public PedidoNotFoundException(Long id) {
        super("Pedido de id " + id + " não encontrado.");
    }

}