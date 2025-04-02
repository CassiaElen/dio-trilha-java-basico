import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> TarefaList;
    
    public ListaTarefa(){
        this.TarefaList = new ArrayList<>();
    }
    
    public void adicionarTarefa(String descricao){
        TarefaList.add(new Tarefa(descricao));
    }
    
    public void removerTarefa(String descricao){
        List<Tarefa> tarefaParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaParaRemover) {
            if (t.getDescricao().equals(descricao)) {
                tarefaParaRemover.add(t);
            }
        }
        TarefaList.removeAll(tarefaParaRemover);
    }
    
    public int obterNumeroTotalTarefa(){
        return TarefaList.size();
    }
    
    public void obterDescricaoTarefas(){
        System.out.println(TarefaList);
    }
    
}

