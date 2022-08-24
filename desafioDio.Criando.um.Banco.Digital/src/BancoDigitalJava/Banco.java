package BancoDigitalJava;

import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Banco(List<Conta> contas) {
        this.contas = contas;
    }
}



