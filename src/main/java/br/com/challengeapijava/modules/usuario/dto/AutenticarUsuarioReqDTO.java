package br.com.challengeapijava.modules.usuario.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class AutenticarUsuarioReqDTO {
    @NotBlank
    @Email
    private String login;
    @NotBlank
    private String senha;

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }
}
