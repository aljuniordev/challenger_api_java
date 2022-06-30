package br.com.lastmilepay.modules.usuario.repositories;

import br.com.lastmilepay.modules.usuario.entities.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service()
public interface UsuarioRepository {

    Usuario findByLogin(String login) throws Exception;

}
