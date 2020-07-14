package br.com.petz.pedidos.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.petz.pedidos.dominio.Categoria;

public interface CategoriaDAO extends JpaRepository<Categoria, Long> {
}