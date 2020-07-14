package br.com.petz.pedidos.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.petz.pedidos.dominio.Cliente;

public interface ClienteDAO extends JpaRepository<Cliente, Long> {
}