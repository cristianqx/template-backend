package br.com.dit.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import br.com.dornelasit.api.model.Pedido;
import br.com.dornelasitapi.controller.OrderApi;

@RestController
public class OrderController implements OrderApi {

	@Override
	public ResponseEntity<Void> createOrder(@Valid Pedido pedidoRessource) {
		
		System.out.println("Processando o pedido:" + pedidoRessource.getCodigoPedido());
		
		return ResponseEntity.ok().build();
	}
}
