package carro.composite;
import java.util.ArrayList;
import java.util.List;

import interfaces.ParteCarro;

public class CompositeCarro {
    String nome;
    public List<ParteCarro> todos = new ArrayList<ParteCarro>();

    public CompositeCarro(String nome){
        this.nome = nome;
    }

    public void adicionar(ParteCarro parte) {
        todos.add(parte);
        imprimirPesoParcial(parte);
    }

    public void adicionar(CompositeCarro compositeCarro) {
        todos.addAll(compositeCarro.todos);
        compositeCarro.setNome(nome);
        imprimirPesoParcial(compositeCarro);
    }

    public void remover(ParteCarro parte) {
        todos.remove(parte);
    }

    private void imprimirPesoParcial(ParteCarro parte) {
        double pesoTotal = getPeso();
        System.out.println("Somando agora o peso de " + parte.getNome() + ": " + parte.getPeso() + ". Total parcial: " + pesoTotal);
    }

    private void imprimirPesoParcial(CompositeCarro compositeCarro) {
        double pesoTotal = getPeso();
        System.out.println("Somando agora o peso de " + compositeCarro.getNome() + ": " + compositeCarro.getPeso() + ". Total parcial: " + pesoTotal);
    }

    public double getPeso() {
        double pesoTotal = 0;
        for (ParteCarro parte : todos) {
            pesoTotal += parte.getPeso();
        }
        return pesoTotal;
    }

    public String getNome() {
        String nome = "";
        for (ParteCarro parte : todos) {
            nome += parte.getNome() + " ";
        }
        return nome;
    }

    public String getNomeComposite() {
        String nome = "";
        for (ParteCarro parte : todos) {
            nome += parte.getNome() + " ";
        }
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }
}
