package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        } else {
            System.out.println("O dicionário está vazio.");
        }
    }

    public void exibirPalavras() {
        if (!dicionarioMap.isEmpty()) {
            System.out.println(dicionarioMap);
        } else {
            System.out.println("O dicionário está vazio.");
        }
    }

    public String pesquisarPorPalavra(String palavra) {
        String porNome = null;
        if (!dicionarioMap.isEmpty()) {
            porNome = dicionarioMap.get(palavra);
            if (porNome == null) {
                System.out.println("Palavra não encontrada no dicionário.");
            }
        } else {
            System.out.println("O dicionário está vazio.");
        }
        return porNome;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Abacate", "Fruta verde e saborosa.");
        dicionario.adicionarPalavra("Bicicleta", "Veículo de duas rodas movido a pedal.");
        dicionario.adicionarPalavra("Árvore", "Planta de grande porte com tronco e folhas.");
        dicionario.adicionarPalavra("Condicionador", "Produto usado para hidratar os cabelos.");

        dicionario.exibirPalavras();

        dicionario.removerPalavra("Bicicleta");
        dicionario.exibirPalavras();
    }
}
