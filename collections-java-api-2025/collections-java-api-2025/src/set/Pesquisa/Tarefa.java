package set.Pesquisa;

public class Tarefa {

    private String descricao;
    private boolean concluida;

    public Tarefa(String descricao, boolean concluida) {
        this.descricao = descricao;
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        return "Tarefa [descricao=" + descricao + ", concluida=" + concluida + "]";
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public boolean isConcluida() {
        return concluida;
    }
}
