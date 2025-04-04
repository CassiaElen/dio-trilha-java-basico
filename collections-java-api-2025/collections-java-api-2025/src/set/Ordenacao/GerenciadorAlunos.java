package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Alunos> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media) {
        alunosSet.add(new Alunos(nome, matricula, media));
    }

    public void removerAlunoPorMatricula(Long matricula) {
        Alunos alunoARemover = null;
        for (Alunos a : alunosSet) {
            if (a.getMatricula().equals(matricula)) {
                alunoARemover = a;
                break;
            }
        }
        if (alunoARemover != null) {
            alunosSet.remove(alunoARemover);
        } else {
            throw new RuntimeException("Aluno não encontrado!");
        }
    }

    public Set<Alunos> exibirAlunosPorNome() {
        Set<Alunos> alunosPorNome = new TreeSet<>(alunosSet);
        if (!alunosSet.isEmpty()) {
            return alunosPorNome;
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public void exibirAlunosPorNota() {
        Set<Alunos> alunosPorNota = new TreeSet<>(new ComparatorNota());
        if (!alunosSet.isEmpty()) {
            alunosPorNota.addAll(alunosSet);
            System.out.println(alunosPorNota);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
    
        gerenciadorAlunos.adicionarAluno("Aluno 1", 123434L, 6.5);
        gerenciadorAlunos.adicionarAluno("Aluno 2", 124245L, 4.3);
        gerenciadorAlunos.adicionarAluno("Aluno 3", 123497L, 9.0);
        gerenciadorAlunos.adicionarAluno("Aluno 4", 123429L, 10.8);
    
        System.out.println("Alunos no gerenciador:");
        System.out.println(gerenciadorAlunos.alunosSet);
        
        gerenciadorAlunos.exibirAlunosPorNome();

        
        gerenciadorAlunos.removerAlunoPorMatricula(123434L);
        System.out.println(gerenciadorAlunos.alunosSet);
    
    
        gerenciadorAlunos.exibirAlunosPorNota();
    }
}
