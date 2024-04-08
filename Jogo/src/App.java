import locais.*;

public class App {
    public static void main(String[] args) throws Exception {

        Localizacao amazonia = new Amazonia();
        amazonia.criarInimigos();

        System.out.println("\nNovo Local\n");

        Localizacao sertao = new Sertao();
        sertao.criarInimigos();

        System.out.println("\nNovo Local\n");

        Localizacao rioJaneiro = new RioJaneiro();
        rioJaneiro.criarInimigos();
    }
}
