package inimigos;

import interfaces.Inimigo;

public class Cangaceiro implements Inimigo{
    int vida;
    String arma = "Rifle Winchester";

    public Cangaceiro(int vida) {
        this.vida = vida;
    }
    
    @Override
    public void atacar() {
        System.out.println("Cangaceiro atacou com " + this.arma + " e causou 20 de dano");
    }
}
