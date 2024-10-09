package org.sg_usuario.model;

public class Contato {
    private String email;
    private String celular;

    public Contato() {
    }

    public Contato(String email, String celular) {
        this.email = email;
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "email='" + email + '\'' +
                ", celular='" + celular + '\'' +
                '}';
    }
}
