package br.com.petz.pedidos.service.pedido.item;

import br.com.petz.pedidos.dominio.Produto;
import br.com.petz.pedidos.service.pedido.PedidoDTO;

public class PedidoItemDTO {
	
	public Long idItem;

	public PedidoDTO pedido;

	public Produto produto;

	public Integer quantidade;

	public Double valor;
}
