package br.com.challengeapijava.modules.usuario.useCases.crudUsuario;

import br.com.challengeapijava.modules.base.dto.EditBaseDTO;
import br.com.challengeapijava.modules.base.dto.NewBaseDTO;
import br.com.challengeapijava.modules.usuario.entities.Usuario;
import br.com.challengeapijava.modules.usuario.repositories.impl.UsuarioJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/crudbase")
public class CrudBaseController {

    @Autowired
    private UsuarioJpaRepository baseRepository;

    @GetMapping("/")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Usuario> findAll() {
        return baseRepository.findAll();
    }

    @PostMapping("/")
    @ResponseStatus(code = HttpStatus.OK)
    public void save(@RequestBody NewBaseDTO dto) {

    }

    @PatchMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public void save(@PathVariable("id") Long id, @RequestBody EditBaseDTO dto) {

    }

    @GetMapping("/excluir")
    @ResponseStatus(code = HttpStatus.OK)
    public void delete(@RequestBody NewBaseDTO dto) {

    }
}
