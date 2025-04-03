package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> LivrosList;

    public CatalogoLivros() {
        this.LivrosList = new ArrayList<>();
    }

    public void adicionarLivros(String titulo, String autor, int anoPublicacao) {
        LivrosList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!LivrosList.isEmpty()) {
            for (Livro l : LivrosList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
            return livrosPorAutor;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!LivrosList.isEmpty()) {
            for (Livro l : LivrosList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
            return livroPorTitulo;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Livro> pesquisarPorIntervalosAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervalosAnos = new ArrayList<>();
        if (!LivrosList.isEmpty()) {
            for (Livro l : LivrosList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervalosAnos.add(l);
                }
            }
        }
        return livrosPorIntervalosAnos;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivros("O médico e o monstro", "Robert Louis Stevenson", 1886);
        catalogoLivros.adicionarLivros("O Fantasma da Ópera", "Gaston Leroux", 1909);
        catalogoLivros.adicionarLivros("Frankenstein ou o Prometeu Moderno", "Mary Shelley", 1818);
        catalogoLivros.adicionarLivros("O Retrato de Dorian Gray", "Oscar Wilde", 1890);
        catalogoLivros.adicionarLivros("Carmilla", "Joseph Sheridan Le Fanu", 1872);
        catalogoLivros.adicionarLivros("O Morro dos Ventos Uivantes", "Emily Brontë", 1847);

        System.out.println(catalogoLivros.pesquisarPorAutor("Emily Brontë"));
        System.out.println(catalogoLivros.pesquisarPorIntervalosAnos(1835, 1900));
        System.out.println(catalogoLivros.pesquisarPorTitulo("O Fantasma da Ópera"));

    }
}
