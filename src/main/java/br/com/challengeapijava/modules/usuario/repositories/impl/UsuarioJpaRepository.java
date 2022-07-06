package br.com.challengeapijava.modules.usuario.repositories.impl;

import br.com.challengeapijava.modules.usuario.entities.Usuario;
import br.com.challengeapijava.modules.usuario.repositories.UsuarioRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioJpaRepository extends JpaRepository<Usuario, Long>, UsuarioRepository {

    //@Query("from Usuario where login = :login and senha = :senha")
    //public Base getTodas(@Param("login")String login, @Param("senha") String senha);

}
