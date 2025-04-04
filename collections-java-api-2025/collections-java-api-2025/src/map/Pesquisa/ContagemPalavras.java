package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contagemPalavrasMap;

    public ContagemPalavras(){
        this.contagemPalavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, int contagem) {
        contagemPalavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!contagemPalavrasMap.isEmpty()) {
            contagemPalavrasMap.remove(palavra);
        } else {
            System.out.println("O conjuto está vazio.");
        }
    }

    public void exibirContagemPalavras(){
        if (!contagemPalavrasMap.isEmpty()) {
            System.out.println(contagemPalavrasMap);
        } else {
            System.out.println("O conjunto está vazio.");
        }
    }

    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = null;
        int maiorContagem = 0;

        for (Map.Entry<String, Integer> entry : contagemPalavrasMap.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                palavraMaisFrequente = entry.getKey();
            }
        }

        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("Java", 5);
        contagemPalavras.adicionarPalavra("Python", 3);
        contagemPalavras.adicionarPalavra("JavaScript", 4);

        contagemPalavras.exibirContagemPalavras();

        contagemPalavras.removerPalavra("Python");
        contagemPalavras.exibirContagemPalavras();

        String palavraMaisFrequente = contagemPalavras.encontrarPalavraMaisFrequente();
        System.out.println("A palavra mais frequente é: " + palavraMaisFrequente);
    }
}
