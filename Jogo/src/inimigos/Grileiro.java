package inimigos;

import interfaces.Inimigo;

public class Grileiro implements Inimigo{
    int vida;
    String arma = "Machado";

    public Grileiro(int vida) {
        this.vida = vida;
    }
    
    @Override
    public void atacar() {
        System.out.println("Grileiro atacou com " + this.arma + " e causou 10 de dano");
    }
}
