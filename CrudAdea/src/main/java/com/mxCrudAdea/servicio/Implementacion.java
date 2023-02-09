package com.mxCrudAdea.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mxCrudAdea.dao.DeaDao;
import com.mxCrudAdea.dominio.Adea;

@Service
public class Implementacion implements Metodos{
	
	@Autowired
	DeaDao dao;

	@Override
	public void guardar(Adea adea) {
		// TODO Auto-generated method stub
		dao.save(adea);
	}

	@Override
	public void editar(Adea adea) {
		// TODO Auto-generated method stub
		dao.save(adea);
	}

	@Override
	public void eliminar(Adea adea) {
		// TODO Auto-generated method stub
		dao.delete(adea);
	}

	@Override
	public Adea buscar(Adea adea) {
		// TODO Auto-generated method stub
		return dao.findById(adea.getId()).orElse(null);
	}

	@Override
	public List<Adea> lista() {
		// TODO Auto-generated method stub
		return (List<Adea>) dao.findAll();
	}

}
