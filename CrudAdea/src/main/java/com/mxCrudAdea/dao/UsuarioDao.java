package com.mxCrudAdea.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mxCrudAdea.dominio.Usuario;

public interface UsuarioDao extends JpaRepository<Usuario, Integer> {
	Usuario findByNombre(String nombre);
 
}
