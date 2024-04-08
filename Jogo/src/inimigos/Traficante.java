package inimigos;

import interfaces.Inimigo;

public class Traficante implements Inimigo{
    int vida;
    String arma = "SubMetralhadora";

    public Traficante(int vida) {
        this.vida = vida;
    }

    @Override
    public void atacar() {
        System.out.println("Traficante atacou com " + this.arma + " e causou 30 de dano");
    }
    
}
