package br.com.challengeapijava.modules.usuario.useCases.autenticarUsuario;

import br.com.challengeapijava.modules.usuario.dto.AutenticarUsuarioReqDTO;
import br.com.challengeapijava.modules.usuario.dto.AutenticarUsuarioResDTO;
import br.com.challengeapijava.modules.usuario.entities.Usuario;
import br.com.challengeapijava.modules.usuario.models.UserAuthenticate;
import br.com.challengeapijava.modules.usuario.repositories.impl.UsuarioJpaRepository;
import br.com.challengeapijava.shared.errors.ApiException;
import br.com.challengeapijava.shared.errors.ErrorMessages;
import br.com.challengeapijava.shared.security.jwt.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AutenticarUsuarioService implements UserDetailsService {

    @Autowired
    UsuarioJpaRepository usuRepository;

    @Autowired
    JwtUtils jwtUtils;

    @Transactional
    public AutenticarUsuarioResDTO login(AutenticarUsuarioReqDTO dto) throws ApiException {
        if (dto == null || dto.getLogin() == null || dto.getSenha() == null) {
            throw new ApiException(ErrorMessages.INVALID_PARAMETERS, "Null");
        }

        try {
            Usuario usu = usuRepository.findByUsername(dto.getLogin());
            String token = jwtUtils.generateJwtToken(usu.getUsername());
            return new AutenticarUsuarioResDTO(token, usu);
        } catch (ApiException ex) {
            throw new ApiException(ErrorMessages.SERVICE_ERROR, ex.getMessage());
        }
    }

    /**
     * Class do spring-boot responsável por carregar usu por username
     */
    @Override
    public UserAuthenticate loadUserByUsername(String username) throws UsernameNotFoundException {
        if (username == null || username.isBlank()) {
            throw new ApiException(ErrorMessages.INVALID_PARAMETERS, "Null");
        }

        try {
            Usuario usu = usuRepository.findByUsername(username);
            if (usu == null) {
                return null;
            }
            return UserAuthenticate.build(usu);
        } catch (ApiException ex) {
            throw new ApiException(ErrorMessages.SERVICE_ERROR, ex.getMessage());
        }
    }

}
