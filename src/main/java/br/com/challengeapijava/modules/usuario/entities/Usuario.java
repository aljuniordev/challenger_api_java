package br.com.challengeapijava.modules.usuario.entities;

import br.com.challengeapijava.modules.base.entities.Base;
import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name="usuario")
public class Usuario implements Serializable {

    @Serial
    private static final long serialVersionUID = -2420346134960559062L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="idusuario")
    private long idUsuario;

    @Column(name="nome")
    private String nome;

    @Column(name="login")
    private String username;

    @Column(name="senha")
    private String senha;

    @Column(name="perfil")
    private String perfil;

    @ManyToOne(fetch = FetchType.EAGER, optional = true, targetEntity = Base.class)
    @JoinColumn(name="idbase", nullable=true)
    private Base base;

    public Usuario() {

    }

    public Usuario(long idUsuario, String nome, String login, String senha, String perfil, Base base) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.username = login;
        this.senha = senha;
        this.perfil = perfil;
        this.base = base;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", nome='" + nome + '\'' +
                ", username='" + username + '\'' +
                ", senha='" + senha + '\'' +
                ", perfil='" + perfil + '\'' +
                ", base=" + base +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;

        Usuario usuario = (Usuario) o;

        return idUsuario == usuario.idUsuario;
    }

    @Override
    public int hashCode() {
        return (int) (idUsuario ^ (idUsuario >>> 32));
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }
}