package carro;

import carro.carroceria_partes.Capo;
import carro.carroceria_partes.Paineis;
import carro.carroceria_partes.ParaLamas;
import carro.carroceria_partes.PortaMalas;
import carro.carroceria_partes.Portas;
import carro.composite.CompositeCarro;
import interfaces.ParteCarro;

public class Carroceria implements ParteCarro{

    String nome;
    double peso;

    public Carroceria(ParaLamas paralamas, Portas portas, Paineis paineis, PortaMalas portamalas, Capo capo) {
        this.nome = "Carroceria";
        this.peso = paralamas.getPeso() + portas.getPeso() + paineis.getPeso() + portamalas.getPeso() + capo.getPeso();
    }

    public Carroceria(CompositeCarro compositeCarro) {
        double pesoTotal = 0;
        for (ParteCarro parte : compositeCarro.todos) {
            pesoTotal += parte.getPeso();
        }
        this.nome = "Carroceria";
        this.peso = pesoTotal;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }
    
}
