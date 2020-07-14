package br.com.petz.pedidos.service.pedido;

import java.util.List;
import java.util.Optional;

import br.com.petz.pedidos.rest.controller.RespostaDeSucesso;

public interface IPedidoService {

	public List<PedidoDTO> listar();
	
    public RespostaDeSucesso salvar(CriacaoPedidoDTO pedidoDTO);
	
    public Optional<PedidoDTO> buscar(Long id);
    
    public void atualizar(CriacaoPedidoDTO criacaoPedidoDTO, Long id);
    
    public void deletar(Long id);
}
