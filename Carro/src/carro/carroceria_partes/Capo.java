package carro.carroceria_partes;

import interfaces.ParteCarro;

public class Capo implements ParteCarro{
    String nome;
    double peso;

    public Capo(String nome, double peso) {
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
