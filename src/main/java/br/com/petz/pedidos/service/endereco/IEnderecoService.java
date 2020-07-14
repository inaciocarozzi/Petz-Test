package br.com.petz.pedidos.service.endereco;

import java.util.List;
import java.util.Optional;

import br.com.petz.pedidos.rest.controller.RespostaDeSucesso;

public interface IEnderecoService {

	public List<EnderecoDTO> listar();
	
    public RespostaDeSucesso salvar(EnderecoDTO enderecoDTO);
	
    public Optional<EnderecoDTO> buscar(Long id);
    
    public void atualizar(EnderecoDTO enderecoDTO, Long id);
    
    public void deletar(Long id);
}
