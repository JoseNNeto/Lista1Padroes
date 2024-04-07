package carro;

import carro.chassi_partes.Suspensao;
import carro.chassi_partes.TremForca;
import carro.composite.CompositeCarro;
import interfaces.ParteCarro;

public class Chassi implements ParteCarro{
    String nome;
    double peso;

    public Chassi(Suspensao suspensao, TremForca trem){
        this.nome = "Chassi";
        this.peso = suspensao.getPeso() + trem.getPeso();
    }

    public Chassi(CompositeCarro compositeCarro) {
        double pesoTotal = 0;
        for (ParteCarro parte : compositeCarro.todos) {
            pesoTotal += parte.getPeso();
        }
        this.nome = "Chassi";
        this.peso = pesoTotal;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }
}
