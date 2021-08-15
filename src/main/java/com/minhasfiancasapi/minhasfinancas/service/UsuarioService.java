package com.minhasfiancasapi.minhasfinancas.service;

import com.minhasfiancasapi.minhasfinancas.model.entity.Usuario;

public interface UsuarioService {
	
	Usuario autenticar(String email, String senha);
	Usuario salvarusuario(Usuario usuario);
	
	void validarEmail(String email);
	
	

}
