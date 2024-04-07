package carro.chassi_partes.tremforca_partes;

import interfaces.ParteCarro;

public class Rodas implements ParteCarro{
    String nome;
    double peso;

    public Rodas(String nome, double peso) {
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
