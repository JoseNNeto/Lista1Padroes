package carro.carroceria_partes;

import interfaces.ParteCarro;

public class Portas implements ParteCarro{
    String nome;
    double peso;

    public Portas(String nome, double peso) {
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
