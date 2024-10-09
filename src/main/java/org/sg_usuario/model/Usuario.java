package org.sg_usuario.model;

public class Usuario {
    private String nome;
    private String cpf;
    private String genero;
    private String perfil;
    private Contato contato;

    public Usuario() {
    }

    public Usuario(String nome, String cpf, String genero, String perfil, Contato contato) {
        this.nome = nome;
        this.cpf = cpf;
        this.genero = genero;
        this.perfil = perfil;
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", genero='" + genero + '\'' +
                ", perfil='" + perfil + '\'' +
                ", contato=" + contato +
                '}';
    }
}
