package com.mxCrudAdea;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.mxCrudAdea.dao.UsuarioDao;
import com.mxCrudAdea.dominio.Usuario;

@SpringBootTest
class CrudAdeaApplicationTests {
	
	@Autowired
	UsuarioDao usuarioDao;
	
	//SecurityConfig security = new SecurityConfig();
	@Autowired
	public BCryptPasswordEncoder encoder;
	
	@Test
	public void guardarUsuario() {
		
		Usuario usu= new Usuario();
		usu.setId(2);
		usu.setNombre("Juan");
		usu.setPassword(encoder.encode("789"));
		
		Usuario guardar=usuarioDao.save(usu);
		
		assertTrue(guardar.getPassword().equalsIgnoreCase(usu.getPassword()));
	}

}
