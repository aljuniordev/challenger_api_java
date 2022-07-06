package br.com.challengeapijava.modules.base.repositories;

import br.com.challengeapijava.modules.base.entities.Base;
import org.springframework.stereotype.Service;

import java.util.List;

@Service()
public interface BaseRepository {

    public List<Base> findAll();

}
