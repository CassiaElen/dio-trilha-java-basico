package OperacoesBasicas;

public class Main {
    
     public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        
        System.out.println("O número total na lista é " + listaTarefa.obterNumeroTotalTarefa());
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O número total na lista é " + listaTarefa.obterNumeroTotalTarefa());
        
        listaTarefa.removerTarefa("Tarefa 1");
        
        listaTarefa.obterDescricaoTarefas();
        
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        
        carrinhoDeCompras.adicionarItem("Detergente", 2.99, 3);
        carrinhoDeCompras.adicionarItem("Elseve Óleo extraordinario", 33.50, 1);
        carrinhoDeCompras.adicionarItem("Toalhinhas umedecidas", 10.32, 2);
        
        carrinhoDeCompras.exibirItens();
        
        System.out.println(carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.removerItem("Detergente");
        carrinhoDeCompras.exibirItens();

     }
    
}
