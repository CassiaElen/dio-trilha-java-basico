import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private List<Conta> contasList = new ArrayList<>();

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void adicionarConta(Conta conta){
        contasList.add(conta);
    }

    public void listarContas(){
        System.out.println("\nContas do cliente "+ nome + " : ");
        for (Conta conta : contasList) {
            System.out.println("- " + conta.getTipo() + " Ag " + conta.getAgencia() + " CC " + conta.getNumero() + " Saldo: " + conta.getSaldo());
        }
    }
}
