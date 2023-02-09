package com.mxCrudAdea.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mxCrudAdea.dominio.Adea;
import com.mxCrudAdea.servicio.Metodos;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class WebService {
	
	@Autowired
	Metodos metodos;
	
	// http://localhost:9000/lista
	
	@GetMapping("lista")
	public List<Adea> lista() {
		// TODO Auto-generated method stub
		var lista = metodos.lista();
		
		return lista;
	}

}
