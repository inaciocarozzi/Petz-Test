package br.com.petz.pedidos.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.petz.pedidos.dominio.Pedido;

public interface PedidoDAO extends JpaRepository<Pedido, Long> {
}