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
    }
    
}
