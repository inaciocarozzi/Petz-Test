package br.com.petz.pedidos.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.petz.pedidos.dominio.Endereco;

public interface EnderecoDAO extends JpaRepository<Endereco, Long> {
}