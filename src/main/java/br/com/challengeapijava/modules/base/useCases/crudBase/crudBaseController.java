package br.com.challengeapijava.modules.base.useCases.crudBase;

import br.com.challengeapijava.modules.base.dto.EditBaseReqDTO;
import br.com.challengeapijava.modules.base.dto.NewBaseReqDTO;
import br.com.challengeapijava.modules.base.entities.Base;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/base/crud")
public class CrudBaseController {

    @Autowired
    private CrudBaseService baseService;

    @GetMapping("/")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Base> findAll() {
        return baseService.findAll();
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
    public void delete(@Valid @RequestBody NewBaseReqDTO dto) {

    }
}
