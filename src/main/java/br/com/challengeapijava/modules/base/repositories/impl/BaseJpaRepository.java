package br.com.challengeapijava.modules.base.repositories.impl;

import br.com.challengeapijava.modules.base.entities.Base;
import br.com.challengeapijava.modules.base.repositories.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseJpaRepository extends JpaRepository<Base, Long>, BaseRepository {

    //@Query("from Usuario where login = :login and senha = :senha")
    //public Base getTodas(@Param("login")String login, @Param("senha") String senha);
}
