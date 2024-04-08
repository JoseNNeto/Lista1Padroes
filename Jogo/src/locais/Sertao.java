package locais;

import inimigos.Cangaceiro;
import interfaces.Inimigo;

public class Sertao extends Localizacao{

    public Sertao() {
        super("Sertao", 0);
        LocalQnt();
    }
    
    public void criarInimigos() {
        Inimigo cangaceiro = new Cangaceiro(100);
        qntInimigos = qntInimigos + 1;
        System.out.println("Cangaceiro apareceu no Sertao"); 
        cangaceiro.atacar();
        LocalQnt();
    }

    public int getQntInimigos() {
        return super.getQntInimigos();
    }
}
