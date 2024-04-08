package locais;

import inimigos.Traficante;
import interfaces.Inimigo;

public class RioJaneiro extends Localizacao{
    public RioJaneiro() {
        super("Rio de Janeiro", 0);
        LocalQnt();
    }
    
    public void criarInimigos() {
        Inimigo traficante = new Traficante(100);
        qntInimigos = qntInimigos + 1; 
        System.out.println("Traficante apareceu no Rio de Janeiro");
        traficante.atacar();
        LocalQnt();
    }

    public int getQntInimigos() {
        return super.getQntInimigos();
    }


}
