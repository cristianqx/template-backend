package br.com.dit.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
@CrossOrigin
@RequestMapping("/template-backend")
public class TesteController{
	
	@RequestMapping(path ="teste", method = RequestMethod.GET)
	public String getTeste() {
		return "Funcionou";
	}
}
