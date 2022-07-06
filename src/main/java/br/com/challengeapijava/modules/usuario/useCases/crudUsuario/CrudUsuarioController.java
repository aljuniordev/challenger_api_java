package br.com.challengeapijava.modules.usuario.useCases.crudUsuario;

import br.com.challengeapijava.modules.base.dto.EditBaseReqDTO;
import br.com.challengeapijava.modules.base.dto.NewBaseReqDTO;
import br.com.challengeapijava.modules.usuario.entities.Usuario;
import br.com.challengeapijava.modules.usuario.repositories.impl.UsuarioJpaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user/crud")
public class CrudUsuarioController {

    @Autowired
    private UsuarioJpaRepository baseRepository;

    @GetMapping("/")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Usuario> findAll() {
        return baseRepository.findAll();
    }

    @PostMapping("/")
    @ResponseStatus(code = HttpStatus.OK)
    public void save(@Valid @RequestBody NewBaseReqDTO dto) {

    }

    @PatchMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public void save(@Valid @PathVariable("id") Long id, @RequestBody EditBaseReqDTO dto) {

    }

    @GetMapping("/del")
    @ResponseStatus(code = HttpStatus.OK)
    public void delete(@RequestBody NewBaseReqDTO dto) {

    }
}
