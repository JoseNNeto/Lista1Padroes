package carro;

import interfaces.ParteCarro;

public class Carro implements ParteCarro {

    String nome;
    double peso;

    public Carro(Carroceria carroceria, Chassi chassi) {
        this.nome = "Carro";
        this.peso = carroceria.getPeso() + chassi.getPeso();
    }
    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPeso() {
        return peso;
    }
    
}
