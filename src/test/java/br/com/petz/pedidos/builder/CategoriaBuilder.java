package br.com.petz.pedidos.builder;

import br.com.petz.pedidos.dominio.Categoria;

public class CategoriaBuilder {
    private String nome = "categoria";

    private CategoriaBuilder(){
    }

    public static CategoriaBuilder umaCategoria(){
        return new CategoriaBuilder();
    }

    public Categoria build(){
        return new Categoria(nome);
    }
}
