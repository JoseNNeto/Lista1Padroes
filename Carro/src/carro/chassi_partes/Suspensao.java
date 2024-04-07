package carro.chassi_partes;

import interfaces.ParteCarro;

public class Suspensao implements ParteCarro{
    String nome;
    double peso;

    public Suspensao(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }
}
