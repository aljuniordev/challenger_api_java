package br.com.lastmilepay.modules.base.repositories.impl;

import br.com.lastmilepay.modules.base.entities.Base;
import br.com.lastmilepay.modules.base.repositories.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BaseJpaRepository extends JpaRepository<Base, Long>, BaseRepository {

    //@Query("from Usuario where login = :login and senha = :senha")
    //public Base getTodas(@Param("login")String login, @Param("senha") String senha);

}
