package carro.chassi_partes.tremforca_partes;

import interfaces.ParteCarro;

public class Diferencial implements ParteCarro{
    String nome;
    double peso;

    public Diferencial(String nome, double peso) {
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
