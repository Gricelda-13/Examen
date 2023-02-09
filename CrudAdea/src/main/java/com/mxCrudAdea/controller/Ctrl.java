package com.mxCrudAdea.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mxCrudAdea.dominio.Adea;
import com.mxCrudAdea.servicio.Metodos;

@Controller
@RequestMapping("Ctrl")
public class Ctrl {
	
	@Autowired
	Metodos metodos;
	
	// http://localhost:8010/Ctrl/lista
	@GetMapping("lista")
	public String lista(Model model) { // model vista -->, interface(pagina web), enviar datos a la plantillas 
	   var listar = metodos.lista();
	   model.addAttribute("lista", listar );
		
		return "index.html";
		
	}
	
	
	//nuevo
	@GetMapping("alta")
	public String alta(Adea adea) {
		
		return "Alta";
		
	}
	
  //guardar
	@PostMapping("guardar")
	public String guardar(Adea adea) {
		metodos.guardar(adea);
		return "redirect:lista";
	}
	
	//editar
	@GetMapping("/editar/{id}")
	public String editar(Adea adea, Model model) {
		adea = metodos.buscar(adea);
		model.addAttribute("adea", adea);
		return "Editar";
	}
	
	//editar
	@PostMapping("update")
	public String update(Adea adea) {
		metodos.editar(adea);
		return "redirect:lista";
		}
	
	//eliminar
		@GetMapping("/eliminar/{id}")
		public String eliminar(Adea adea, Model model) {
			adea = metodos.buscar(adea);
			model.addAttribute("adea", adea);
			return "Eliminar";
		}
		
		@PostMapping("delete")
		public String delete(Adea adea) {
			metodos.eliminar(adea);
			return "redirect:lista";
			}
	
}
