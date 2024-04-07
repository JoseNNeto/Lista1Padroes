package carro.chassi_partes;

import carro.chassi_partes.tremforca_partes.Diferencial;
import carro.chassi_partes.tremforca_partes.Motor;
import carro.chassi_partes.tremforca_partes.Rodas;
import carro.chassi_partes.tremforca_partes.Transmissao;
import interfaces.ParteCarro;
import carro.composite.CompositeCarro;

public class TremForca implements ParteCarro{
    String nome;
    double peso;

    public TremForca(Motor motor, Transmissao transmissao, Diferencial diferencial, Rodas rodas){
        this.nome = "Trem de Força";
        this.peso = motor.getPeso() + transmissao.getPeso() + diferencial.getPeso() + rodas.getPeso();
    }

    public TremForca(CompositeCarro compositeCarro) {
        double pesoTotal = 0;
        for (ParteCarro parte : compositeCarro.todos) {
            pesoTotal += parte.getPeso();
        }
        this.nome = "Trem de Força";
        this.peso = pesoTotal;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }
}
