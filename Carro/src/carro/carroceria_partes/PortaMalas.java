package carro.carroceria_partes;

import interfaces.ParteCarro;

public class PortaMalas implements ParteCarro{
    String nome;
    double peso;

    public PortaMalas(String nome, double peso) {
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
