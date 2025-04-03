package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> CarrinhoCompras;
    
    public CarrinhoDeCompras(){
        this.CarrinhoCompras = new ArrayList<>();
    }
    
    public void adicionarItem(String nome, double preco, int quantidade){
        CarrinhoCompras.add(new Item(nome, preco, quantidade));
    }
    
    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();
        if (!CarrinhoCompras.isEmpty()) {
            for (Item i : CarrinhoCompras) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itemParaRemover.add(i);
                }
            }
            CarrinhoCompras.removeAll(itemParaRemover);
        } else {
            System.out.println("A lista ta vazia!");
        }
    }
    
    public double calcularValorTotal(){
        double soma = 0.00;
        for (Item i : CarrinhoCompras) {
            double mult = i.getPreco() * i.getQuantidade();
            soma += mult; 
        }
        return soma;
    }
    
    public void exibirItens(){
        System.out.println(CarrinhoCompras);
    }
    
}
