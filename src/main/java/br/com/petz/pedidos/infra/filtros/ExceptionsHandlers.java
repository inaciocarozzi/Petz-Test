package br.com.petz.pedidos.infra.filtros;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.petz.pedidos.exception.CategoriaNotFoundException;
import br.com.petz.pedidos.exception.ClienteNotFoundException;
import br.com.petz.pedidos.exception.EnderecoNotFoundException;
import br.com.petz.pedidos.exception.ItemNotFoundException;
import br.com.petz.pedidos.exception.PedidoNotFoundException;
import br.com.petz.pedidos.exception.ProdutoNotFoundException;

@ControllerAdvice
public class ExceptionsHandlers {
    
	@ExceptionHandler({CategoriaNotFoundException.class})
    public final ResponseEntity<Error> tratarCategoria(CategoriaNotFoundException categoriaNotFoundException) {
        String mensagemDeErro = categoriaNotFoundException.getMessage();

        Error errosDaApi = new Error();
        errosDaApi.mensagem = mensagemDeErro;
        errosDaApi.status = HttpStatus.BAD_REQUEST.value();
        errosDaApi.data = LocalDateTime.now();

        return new ResponseEntity<>(errosDaApi, HttpStatus.BAD_REQUEST);
    }
	
	@ExceptionHandler({ClienteNotFoundException.class})
    public final ResponseEntity<Error> tratarCliente(ClienteNotFoundException clienteNotFoundException) {
        String mensagemDeErro = clienteNotFoundException.getMessage();

        Error errosDaApi = new Error();
        errosDaApi.mensagem = mensagemDeErro;
        errosDaApi.status = HttpStatus.BAD_REQUEST.value();
        errosDaApi.data = LocalDateTime.now();

        return new ResponseEntity<>(errosDaApi, HttpStatus.BAD_REQUEST);
    }
	
	@ExceptionHandler({EnderecoNotFoundException.class})
    public final ResponseEntity<Error> tratarCliente(EnderecoNotFoundException enderecoNotFoundException) {
        String mensagemDeErro = enderecoNotFoundException.getMessage();

        Error errosDaApi = new Error();
        errosDaApi.mensagem = mensagemDeErro;
        errosDaApi.status = HttpStatus.BAD_REQUEST.value();
        errosDaApi.data = LocalDateTime.now();

        return new ResponseEntity<>(errosDaApi, HttpStatus.BAD_REQUEST);
    }
	
	@ExceptionHandler({ItemNotFoundException.class})
    public final ResponseEntity<Error> tratarCliente(ItemNotFoundException itemNotFoundException) {
        String mensagemDeErro = itemNotFoundException.getMessage();

        Error errosDaApi = new Error();
        errosDaApi.mensagem = mensagemDeErro;
        errosDaApi.status = HttpStatus.BAD_REQUEST.value();
        errosDaApi.data = LocalDateTime.now();

        return new ResponseEntity<>(errosDaApi, HttpStatus.BAD_REQUEST);
    }
	
	@ExceptionHandler({PedidoNotFoundException.class})
    public final ResponseEntity<Error> tratarCliente(PedidoNotFoundException pedidoNotFoundException) {
        String mensagemDeErro = pedidoNotFoundException.getMessage();

        Error errosDaApi = new Error();
        errosDaApi.mensagem = mensagemDeErro;
        errosDaApi.status = HttpStatus.BAD_REQUEST.value();
        errosDaApi.data = LocalDateTime.now();

        return new ResponseEntity<>(errosDaApi, HttpStatus.BAD_REQUEST);
    }
	
	@ExceptionHandler({ProdutoNotFoundException.class})
    public final ResponseEntity<Error> tratarCliente(ProdutoNotFoundException produtoNotFoundException) {
        String mensagemDeErro = produtoNotFoundException.getMessage();

        Error errosDaApi = new Error();
        errosDaApi.mensagem = mensagemDeErro;
        errosDaApi.status = HttpStatus.BAD_REQUEST.value();
        errosDaApi.data = LocalDateTime.now();

        return new ResponseEntity<>(errosDaApi, HttpStatus.BAD_REQUEST);
    }
}
