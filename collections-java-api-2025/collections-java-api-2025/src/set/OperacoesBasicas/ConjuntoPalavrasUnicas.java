package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavrasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    public void adicinarpalavra(String palavra) {
        this.palavrasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        Set<String> palavraParaRemover = new HashSet<>();
        if (!palavrasSet.isEmpty()) {
            for (String s : palavrasSet) {
                if (s.equalsIgnoreCase(palavra)) {
                    palavraParaRemover.add(s);
                }
            }
            palavrasSet.removeAll(palavraParaRemover);
        } else {
            System.out.println("A lista ta vazia!");
        }
    }

    public void verificarPalavra(String palavra) {
        if (!palavrasSet.isEmpty()) {
            for (String s : palavrasSet) {
                if (s.equals(palavra)) {
                    System.out.println("A palavra " + palavra + " está presente no conjuto.");
                    break;
                }
            }
        } else {
            System.out.println("A lista ta vazia!");
        }
    }

    public void exibirPalavrasUnicas() {
        if (!palavrasSet.isEmpty()) {
            System.out.println(this.palavrasSet);
        } else {
            System.out.println("A lista ta vazia!");
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicinarpalavra("Abacate");
        conjuntoPalavrasUnicas.adicinarpalavra("Bicicleta");
        conjuntoPalavrasUnicas.adicinarpalavra("Árvore");
        conjuntoPalavrasUnicas.adicinarpalavra("Condicionador");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("Abacate");

        conjuntoPalavrasUnicas.verificarPalavra("Árvore");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

    }

}
