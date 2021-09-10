package org.generation.BlogPessoal.Seguranca;

import java.util.Optional;

import org.generation.BlogPessoal.Model.Usuario;
import org.generation.BlogPessoal.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
	
	@Autowired
	private UsuarioRepository userRepository;

	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
	Optional<Usuario> user = userRepository.findByUsuario(userName);
	user.orElseThrow(() -> new UsernameNotFoundException(userName + "Not found."));
	
	return user.map(UserDetailsImpl::new).get();
	}
	}
