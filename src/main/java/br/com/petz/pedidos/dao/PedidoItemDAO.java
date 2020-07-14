package br.com.petz.pedidos.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.petz.pedidos.dominio.PedidoItem;

public interface PedidoItemDAO extends JpaRepository<PedidoItem, Long> {
	
}