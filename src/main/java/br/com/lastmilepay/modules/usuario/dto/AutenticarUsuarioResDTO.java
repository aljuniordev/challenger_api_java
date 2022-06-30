package br.com.lastmilepay.modules.usuario.dto;

import br.com.lastmilepay.modules.base.entities.Base;
import br.com.lastmilepay.modules.usuario.entities.Usuario;

public class AutenticarUsuarioResDTO {
    private String token;
    private UsuarioDTO usuDTO;

    public AutenticarUsuarioResDTO(String token, UsuarioDTO usuDTO) {
        this.token = token;
        this.usuDTO = usuDTO;
    }
    public AutenticarUsuarioResDTO(String token, Usuario usu) {
        this(token, new UsuarioDTO(usu));
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public UsuarioDTO getUsuDTO() {
        return usuDTO;
    }

    public void setUsuDTO(UsuarioDTO usuDTO) {
        this.usuDTO = usuDTO;
    }

}

class UsuarioDTO {
    private String nome;
    private String login;
    private String perfil;
    private BaseDTO baseDTO;

    public UsuarioDTO(String nome, String login, String perfil, BaseDTO baseDTO) {
        this.nome = nome;
        this.login = login;
        this.perfil = perfil;
        this.baseDTO = baseDTO;
    }

    public UsuarioDTO(Usuario usu) {
        this(usu.getNome(), usu.getLogin(), usu.getPerfil(), new BaseDTO(usu.getBase()));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public BaseDTO getBaseDTO() {
        return baseDTO;
    }

    public void setBaseDTO(BaseDTO baseDTO) {
        this.baseDTO = baseDTO;
    }
}

class BaseDTO {
    private long idbase;
    private Integer nrbase;
    private String sigla;

    public BaseDTO(long idbase, Integer nrbase, String sigla) {
        this.idbase = idbase;
        this.nrbase = nrbase;
        this.sigla = sigla;
    }

    public BaseDTO(Base base) {
        this(base.getIdBase(), base.getNrBase(), base.getSigla());
    }

    public long getIdbase() {
        return idbase;
    }

    public void setIdbase(long idbase) {
        this.idbase = idbase;
    }

    public Integer getNrbase() {
        return nrbase;
    }

    public void setNrbase(Integer nrbase) {
        this.nrbase = nrbase;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
}


