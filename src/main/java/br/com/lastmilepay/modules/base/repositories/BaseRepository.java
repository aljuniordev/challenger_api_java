package br.com.lastmilepay.modules.base.repositories;

import br.com.lastmilepay.modules.base.entities.Base;
import org.springframework.stereotype.Service;

import java.util.List;

@Service()
public interface BaseRepository {

    public List<Base> findAll();

}
