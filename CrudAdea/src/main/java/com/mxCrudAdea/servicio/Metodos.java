package com.mxCrudAdea.servicio;

import java.util.List;

import com.mxCrudAdea.dominio.Adea;

public interface Metodos {
	
	public void guardar(Adea adea);
	public void editar(Adea adea);
	public void eliminar(Adea adea);
	
	
	public Adea buscar(Adea adea);
	public List<Adea> lista();

}
