package br.com.challengeapijava.modules.usuario.repositories;

import br.com.challengeapijava.modules.usuario.entities.Usuario;
import br.com.challengeapijava.shared.errors.ApiException;
import org.springframework.stereotype.Service;

@Service()
public interface UsuarioRepository {

    Usuario findByUsername(String username) throws ApiException;

}
