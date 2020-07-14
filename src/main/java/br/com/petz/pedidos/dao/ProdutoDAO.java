package br.com.petz.pedidos.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.petz.pedidos.dominio.Produto;

public interface ProdutoDAO extends JpaRepository<Produto, Long> {
}	