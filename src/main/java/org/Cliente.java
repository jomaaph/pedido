package org;

public class Cliente {
    String nome;
    String email;

    public Cliente(String nome , String email){
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}
