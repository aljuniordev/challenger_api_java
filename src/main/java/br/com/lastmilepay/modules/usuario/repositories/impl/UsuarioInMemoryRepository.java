package br.com.lastmilepay.modules.usuario.repositories.impl;

import br.com.lastmilepay.modules.usuario.entities.Usuario;
import br.com.lastmilepay.modules.usuario.repositories.UsuarioRepository;
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
    public Usuario findByLogin(String login) {
        List<Usuario> usuList = databaseList
                .stream()
                .filter(u -> u.getLogin().equals(login))
                .collect(Collectors.toList());

        if (usuList == null || usuList.isEmpty()) {
            return null;
        }

        return usuList.get(0);
    }

}
