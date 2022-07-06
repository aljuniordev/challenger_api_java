package br.com.challengeapijava.modules.usuario.useCases.autenticarUsuario;

import br.com.challengeapijava.modules.usuario.dto.AutenticarUsuarioReqDTO;
import br.com.challengeapijava.modules.usuario.dto.AutenticarUsuarioResDTO;
import br.com.challengeapijava.modules.usuario.entities.Usuario;
import br.com.challengeapijava.shared.errors.ApiException;
import br.com.challengeapijava.shared.errors.ErrorMessages;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/auth")
public class AutenticarUsuarioController {

    @Autowired
    private AutenticarUsuarioService autenticarService;

    @GetMapping("/teste")
    @ResponseStatus(code = HttpStatus.OK)
    public String testeAtivo() {
        return "It's alive!";
    }

    @PostMapping("/login")
    @ResponseStatus(code = HttpStatus.OK)
    public AutenticarUsuarioResDTO autenticar(@Valid @RequestBody AutenticarUsuarioReqDTO dto) {
        if (dto == null) {
            throw new ApiException(ErrorMessages.INVALID_PARAMETERS, "Null");
        }

        try {
            return autenticarService.login(dto);
        } catch (ApiException ex) {
            throw new ApiException(ErrorMessages.SERVICE_ERROR, ex.getMessage());
        }
    }

    @GetMapping("/")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Usuario> validaToken() {
        return new ArrayList<Usuario>();
    }
}
