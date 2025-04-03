package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjutoConvidado {
    private Set<Convidado> convidadoSet;

    public ConjutoConvidado(){
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite (int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidado(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjutoConvidado conjutoConvidado = new ConjutoConvidado();

        conjutoConvidado.adicionarConvidado("convidado 1", 123);
        conjutoConvidado.adicionarConvidado("convidado 2", 124);
        conjutoConvidado.adicionarConvidado("convidado 3", 125);
        conjutoConvidado.adicionarConvidado("convidado 4", 125);

        conjutoConvidado.exibirConvidado();

        System.out.println("Existem " + conjutoConvidado.contarConvidados() + " convidados");

        conjutoConvidado.removerConvidadoPorCodigoConvite(123);
        
        System.out.println("Existem " + conjutoConvidado.contarConvidados() + " convidados");

    }
}