package br.com.lastmilepay.modules.base.repositories.impl;

import br.com.lastmilepay.modules.base.entities.Base;
import br.com.lastmilepay.modules.base.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BaseInMemoryRepository implements BaseRepository {

    private List<Base> databaseList;

    public BaseInMemoryRepository() {
        databaseList = new ArrayList<>();
    }

    @Override
    public List<Base> findAll() {
        return databaseList;
    }

}
