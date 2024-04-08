package locais;

import inimigos.Grileiro;
import interfaces.Inimigo;

public class Amazonia extends Localizacao{
    
    public Amazonia() {
        super("Amazonia", 0);
        LocalQnt();
    }

    public void criarInimigos() {
        Inimigo grileiro = new Grileiro(100);
        qntInimigos = qntInimigos + 1; 
        System.out.println("Grileiro apareceu na Amazonia");
        grileiro.atacar();
        LocalQnt();
    }
    
    public int getQntInimigos() {
        return super.getQntInimigos();
    }
}
