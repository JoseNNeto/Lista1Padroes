package locais;
public class Localizacao {
    String nome;
    int qntInimigos;

    public Localizacao(String nome, int qntInimigos) {
        this.nome = nome;
        this.qntInimigos = qntInimigos;
    }
    
    public void criarInimigos() {
    }
    
    public int getQntInimigos() {
        return this.qntInimigos;
    }

    public void LocalQnt(){
        System.out.println("Local: " + this.nome + " Quantidade de inimigos: " + this.qntInimigos);
    }
}
