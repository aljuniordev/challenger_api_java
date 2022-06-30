package br.com.lastmilepay.modules.usuario.useCases.autenticarUsuario;

import br.com.lastmilepay.modules.usuario.dto.AutenticarUsuarioReqDTO;
import br.com.lastmilepay.modules.usuario.dto.AutenticarUsuarioResDTO;
import br.com.lastmilepay.modules.usuario.entities.Usuario;
import br.com.lastmilepay.modules.usuario.repositories.impl.UsuarioJpaRepository;
import br.com.lastmilepay.shared.errors.ApiException;
import br.com.lastmilepay.shared.errors.ErrorMessages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/login")
public class AutenticarUsuarioController {

    @Autowired
    private AutenticarUsuarioService autenticarService;

    @GetMapping("/teste")
    @ResponseStatus(code = HttpStatus.OK)
    public String testeAtivo() {
        return "It's alive!";
    }

    @PostMapping("/")
    @ResponseStatus(code = HttpStatus.OK)
    public AutenticarUsuarioResDTO autenticar(@RequestBody AutenticarUsuarioReqDTO dto) {
        if (dto == null) {
            throw new ApiException(ErrorMessages.INVALID_PARAMETERS, "Null");
        }

        try {
            return autenticarService.login(dto);
        } catch (Exception ex) {
            throw new ApiException(ErrorMessages.SERVICE_ERROR, ex.getMessage());
        }
    }

    @GetMapping("/")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Usuario> validaToken() {
        return new ArrayList<Usuario>();
    }
}
