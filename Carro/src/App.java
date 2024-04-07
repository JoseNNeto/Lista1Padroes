import carro.Carroceria;
import carro.Chassi;
import carro.carroceria_partes.Capo;
import carro.carroceria_partes.Paineis;
import carro.carroceria_partes.ParaLamas;
import carro.carroceria_partes.PortaMalas;
import carro.carroceria_partes.Portas;
import carro.chassi_partes.Suspensao;
import carro.chassi_partes.TremForca;
import carro.chassi_partes.tremforca_partes.Diferencial;
import carro.chassi_partes.tremforca_partes.Motor;
import carro.chassi_partes.tremforca_partes.Rodas;
import carro.chassi_partes.tremforca_partes.Transmissao;
import carro.composite.CompositeCarro;
import interfaces.ParteCarro;

public class App {
    public static void main(String[] args) throws Exception {
        //Carroceria
        ParteCarro paralamas = new ParaLamas("ParaLamas", 10);
        ParteCarro portas = new Portas("Portas", 30);
        ParteCarro paineis = new Paineis("Painéis", 10);
        ParteCarro portaMalas = new PortaMalas("Porta-Malas", 40);
        ParteCarro capo = new Capo("Capô", 50);

        CompositeCarro carroceria = new CompositeCarro("Carroceria");
        carroceria.adicionar(paralamas);
        carroceria.adicionar(portas);
        carroceria.adicionar(paineis);
        carroceria.adicionar(portaMalas);
        carroceria.adicionar(capo);

        //Trem de Força
        ParteCarro motor = new Motor("Motor", 150);
        ParteCarro transmissao = new Transmissao("Transmissão", 80);
        ParteCarro diferencial = new Diferencial("Diferencial", 60);
        ParteCarro rodas = new Rodas("Rodas", 40);

        CompositeCarro tremForca = new CompositeCarro("Trem de Força");
        tremForca.adicionar(motor);
        tremForca.adicionar(transmissao);
        tremForca.adicionar(diferencial);
        tremForca.adicionar(rodas);

        //Chassi
        CompositeCarro chassi = new CompositeCarro("Chassi");
        ParteCarro suspensao = new Suspensao("Suspensao", 20);
        ParteCarro tremDeForca = new TremForca(tremForca);
        chassi.adicionar(suspensao);
        chassi.adicionar(tremDeForca);

        //Carro
        CompositeCarro carro = new CompositeCarro("Carro");
        ParteCarro carroceriaParte = new Carroceria(carroceria);
        ParteCarro chassiParte = new Chassi(chassi);
        carro.adicionar(carroceriaParte);
        carro.adicionar(chassiParte);

        //Calcular total
        double pesoTotal = carro.getPeso();
        System.out.println("Peso total do carro: " + pesoTotal);
    }
}
