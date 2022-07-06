package br.com.challengeapijava.modules.usuario.models;

import br.com.challengeapijava.modules.usuario.entities.Usuario;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.*;

public class UserAuthenticate implements UserDetails {
	private static final long serialVersionUID = 1L;

	private String id;

	private String username;

	@JsonIgnore
	private String password;

	private Collection<? extends GrantedAuthority> authorities;

	public UserAuthenticate(String id, String username, String password,
                            Collection<? extends GrantedAuthority> authorities) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.authorities = authorities;
	}

	public static UserAuthenticate build(Usuario user) {
		List<GrantedAuthority> authorities = List.of(new SimpleGrantedAuthority(user.getPerfil()));

		return new UserAuthenticate(
				String.valueOf(user.getIdUsuario()),
				user.getUsername(),
				user.getSenha(),
				authorities);
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	public String getId() {
		return id;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		UserAuthenticate user = (UserAuthenticate) o;
		return Objects.equals(id, user.id);
	}
}
