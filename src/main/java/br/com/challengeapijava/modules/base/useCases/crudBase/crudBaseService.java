package br.com.challengeapijava.modules.base.useCases.crudBase;

import br.com.challengeapijava.modules.base.entities.Base;
import br.com.challengeapijava.modules.base.repositories.impl.BaseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CrudBaseService {
    @Autowired
    private BaseJpaRepository baseRepository;
    public List<Base> findAll() {
        return baseRepository.findAll();
    };
}
