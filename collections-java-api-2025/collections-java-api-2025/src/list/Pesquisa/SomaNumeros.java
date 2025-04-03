package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }

    public int calularSoma() {
        int soma = 0;
        for (Integer numero : numeros) {
            soma += numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!numeros.isEmpty()) {
            for (Integer numero : numeros) {
                if (numero >= maiorNumero) {
                    maiorNumero = numero;
                }
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if (!numeros.isEmpty()) {
            for (Integer numero : numeros) {
                if (numero <= menorNumero) {
                    menorNumero = numero;
                }
            }
        }
        return menorNumero;
    }

    public void exibirNumeros() {
        if (!numeros.isEmpty()) {
            System.out.println(this.numeros);
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(1886);
        somaNumeros.adicionarNumero(1909);
        somaNumeros.adicionarNumero(1818);
        somaNumeros.adicionarNumero(1890);
        somaNumeros.adicionarNumero(1872);
        somaNumeros.adicionarNumero(1847);

        somaNumeros.exibirNumeros();
        System.out.println("A soma de todos os numeros " + somaNumeros.calularSoma());
        System.out.println("O maior número " + somaNumeros.encontrarMaiorNumero());
        System.out.println("O menor número " + somaNumeros.encontrarMenorNumero());

    }
}
