package br.com.lastmilepay.modules.base.useCases.crudBase;

import br.com.lastmilepay.modules.base.dto.EditBaseDTO;
import br.com.lastmilepay.modules.base.dto.NewBaseDTO;
import br.com.lastmilepay.modules.base.entities.Base;
import br.com.lastmilepay.modules.base.repositories.impl.BaseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/crudbase")
public class crudBaseController {

    @Autowired
    private BaseJpaRepository baseRepository;

    @GetMapping("/")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Base> findAll() {
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
