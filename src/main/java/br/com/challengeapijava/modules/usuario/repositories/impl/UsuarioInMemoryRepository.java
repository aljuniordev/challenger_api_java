package br.com.challengeapijava.modules.usuario.repositories.impl;

import br.com.challengeapijava.modules.usuario.entities.Usuario;
import br.com.challengeapijava.modules.usuario.repositories.UsuarioRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class UsuarioInMemoryRepository implements UsuarioRepository {

    private List<Usuario> databaseList;

    public UsuarioInMemoryRepository() {
        databaseList = new ArrayList<>();
    }

    @Override
    public Usuario findByUsername(String username) {
        List<Usuario> usuList = databaseList
                .stream()
                .filter(u -> u.getUsername().equals(username))
                .collect(Collectors.toList());

        if (usuList == null || usuList.isEmpty()) {
            return null;
        }

        return usuList.get(0);
    }

}
