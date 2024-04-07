package carro.carroceria_partes;

import interfaces.ParteCarro;

public class Paineis implements ParteCarro{
    String nome;
    double peso;

    public Paineis(String nome, double peso) {
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
