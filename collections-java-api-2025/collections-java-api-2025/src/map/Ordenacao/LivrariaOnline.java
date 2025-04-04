package map.Ordenacao;

import java.util.*;

public class LivrariaOnline {
    private Map<String, Livro> livrosMap;

    public LivrariaOnline() {
        this.livrosMap = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        livrosMap.put(link, new Livro(link, titulo, autor, preco));
    }

    public void removerLivro(String titulo) {
        List<String> chavesParaRemover = new ArrayList<>();
        for (Map.Entry<String, Livro> entry : livrosMap.entrySet()) {
            if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                chavesParaRemover.add(entry.getKey());
            }
        }
        for (String chave : chavesParaRemover) {
            livrosMap.remove(chave);
        }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livrosMap.entrySet());
        Collections.sort(livrosParaOrdenarPorPreco, new Livro.ComparatorPorPreco());
        
        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();
        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorPreco) {
            livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        }
        return livrosOrdenadosPorPreco;
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorAutor() {
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorAutor = new ArrayList<>(livrosMap.entrySet());
        Collections.sort(livrosParaOrdenarPorAutor, new Livro.ComparatorPorAutor());
        
        Map<String, Livro> livrosOrdenadosPorAutor = new LinkedHashMap<>();
        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorAutor) {
            livrosOrdenadosPorAutor.put(entry.getKey(), entry.getValue());
        }
        return livrosOrdenadosPorAutor;
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
        Map<String, Livro> livrosPorAutor = new LinkedHashMap<>();
        for (Map.Entry<String, Livro> entry : livrosMap.entrySet()) {
            Livro livro = entry.getValue();
            if (livro.getAutor().equalsIgnoreCase(autor)) {
                livrosPorAutor.put(entry.getKey(), livro);
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> obterLivroMaisCaro() {
        List<Livro> livrosMaisCaros = new ArrayList<>();
        double precoMaisAlto = Double.MIN_VALUE;

        if (!livrosMap.isEmpty()) {
            for (Livro livro : livrosMap.values()) {
                if (livro.getPreco() > precoMaisAlto) {
                    precoMaisAlto = livro.getPreco();
                }
            }
            
            for (Livro livro : livrosMap.values()) {
                if (livro.getPreco() == precoMaisAlto) {
                    livrosMaisCaros.add(livro);
                }
            }
        } else {
            throw new NoSuchElementException("A livraria está vazia!");
        }
        return livrosMaisCaros;
    }

    public List<Livro> obterLivroMaisBarato() {
        List<Livro> livrosMaisBaratos = new ArrayList<>();
        double precoMaisBaixo = Double.MAX_VALUE;

        if (!livrosMap.isEmpty()) {
            for (Livro livro : livrosMap.values()) {
                if (livro.getPreco() < precoMaisBaixo) {
                    precoMaisBaixo = livro.getPreco();
                }
            }
            
            for (Livro livro : livrosMap.values()) {
                if (livro.getPreco() == precoMaisBaixo) {
                    livrosMaisBaratos.add(livro);
                }
            }
        } else {
            throw new NoSuchElementException("A livraria está vazia!");
        }
        return livrosMaisBaratos;
    }

    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();
        livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", "1984", "George Orwell", 50d);
        livrariaOnline.adicionarLivro("https://amzn.to/47Umiun", "A Revolução dos Bichos", "George Orwell", 7.05d);
        livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6", "Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d);
        livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk", "Malorie", "Josh Malerman", 5d);
        livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L", "E Não Sobrou Nenhum", "Agatha Christie", 50d);
        livrariaOnline.adicionarLivro("https://amzn.to/45u86q4", "Assassinato no Expresso do Oriente", "Agatha Christie", 5d);

        System.out.println("Livros ordenados por preço: \n" + livrariaOnline.exibirLivrosOrdenadosPorPreco());

        System.out.println("Livros ordenados por autor: \n" + livrariaOnline.exibirLivrosOrdenadosPorAutor());

        String autorPesquisa = "Josh Malerman";
        System.out.println("Livros por autor '" + autorPesquisa + "': \n" + livrariaOnline.pesquisarLivrosPorAutor(autorPesquisa));

        System.out.println("Livro mais caro: " + livrariaOnline.obterLivroMaisCaro());

        System.out.println("Livro mais barato: " + livrariaOnline.obterLivroMaisBarato());

        livrariaOnline.removerLivro("1984");
        System.out.println("Livros após remoção: \n" + livrariaOnline.livrosMap);
    }
}