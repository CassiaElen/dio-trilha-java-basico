package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
        agendaContatoMap.remove(nome);
        } else {
            System.out.println("A agenda de contatos está vazia.");
        }
    }

    public void exibirContatos() {
        if (!agendaContatoMap.isEmpty()) {
            System.out.println(agendaContatoMap);
        } else {
            System.out.println("A agenda de contatos está vazia.");
        }
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        if (numeroPorNome == null) {
            System.out.println("Contato não encontrado na agenda.");
        }
        } else {
            System.out.println("A agenda de contatos está vazia.");
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Claudiana", 12349876);
        agendaContatos.adicionarContato("Joelma", 29384223);
        agendaContatos.adicionarContato("Jurema", 35235235);
        agendaContatos.adicionarContato("Anacelia", 34634666);
        agendaContatos.adicionarContato("Marieli", 34634643);
        agendaContatos.adicionarContato("Claudiana", 34636434);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Marieli");
        agendaContatos.exibirContatos();

        String nomePesquisa = "Joelma";
        Integer numeroPesquisa = agendaContatos.pesquisarPorNome("Anacelia");
        System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);

        String nomePesquisaNaoExistente = "Karina";
        Integer numeroPesquisaNaoExistente = agendaContatos.pesquisarPorNome(nomePesquisaNaoExistente);
        System.out.println("Número de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente);
    }
}
