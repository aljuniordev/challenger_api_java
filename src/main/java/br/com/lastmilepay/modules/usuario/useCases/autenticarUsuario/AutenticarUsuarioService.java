package br.com.lastmilepay.modules.usuario.useCases.autenticarUsuario;

import br.com.lastmilepay.modules.usuario.dto.AutenticarUsuarioReqDTO;
import br.com.lastmilepay.modules.usuario.dto.AutenticarUsuarioResDTO;
import br.com.lastmilepay.modules.usuario.entities.Usuario;
import br.com.lastmilepay.modules.usuario.repositories.UsuarioRepository;
import br.com.lastmilepay.modules.usuario.repositories.impl.UsuarioJpaRepository;
import br.com.lastmilepay.shared.errors.ApiException;
import br.com.lastmilepay.shared.errors.ErrorMessages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutenticarUsuarioService {

    @Autowired
    UsuarioJpaRepository usuRepository;

    public AutenticarUsuarioResDTO login(AutenticarUsuarioReqDTO dto) throws Exception {
        if (dto == null || dto.getLogin() == null || dto.getSenha() == null) {
            throw new ApiException(ErrorMessages.INVALID_PARAMETERS, "Null");
        }

        try {
            Usuario usu = usuRepository.findByLogin(dto.getLogin());

            String token = "1234";

            return new AutenticarUsuarioResDTO(token, usu);
        } catch (Exception ex) {
            throw new ApiException(ErrorMessages.SERVICE_ERROR, ex.getMessage());
        }
    }
}
