package com.mxCrudAdea.serviceSecurity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mxCrudAdea.dao.UsuarioDao;
import com.mxCrudAdea.dominio.Usuario;


@Service
public class userService implements UserDetailsService {
	//metodo donde voy a sacar mis usuarios
	// inyeccion de dependecias
	
	 @Autowired
	 UsuarioDao usuariosDao;
	 
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		//Usuario usu= usuariosDao.findByNombre(username);
		
		Usuario usu =null;
		for(Usuario u : usuariosDao.findAll()) {
			if(u.getNombre().equals(username)) {
				usu=u;
			}
		}
		
		List<GrantedAuthority> roles = new ArrayList<GrantedAuthority>();
		//roles.add(new SimpleGrantedAuthority("ADMIN"));
		
		for(Usuario u : usuariosDao.findAll()) {
			if(u.getNombre().equals(username)) {
				roles.add(new SimpleGrantedAuthority("ADMIN"));
			}
		}
		
		UserDetails userDetails = new User(usu.getNombre(), usu.getPassword(), roles);
		
		return userDetails;
	}

}
