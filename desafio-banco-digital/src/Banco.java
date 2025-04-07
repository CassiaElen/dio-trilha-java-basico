import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
        Cliente cliente = conta.getCliente();
        cliente.adicionarConta(conta);
        
        if (!clientes.contains(cliente)) {
            clientes.add(cliente);
        }
    }

    public void listarClientes(){
        System.out.println("\n=== Clientes do Banco " + nome + " ===");
        clientes.forEach(cliente -> {
            System.out.println("Nome: " + cliente.getNome() + " - CPF: " + cliente.getCpf());
        });
    }

    public void aplicarTaxasERendimentos() {
        contas.forEach(conta -> {
            conta.aplicarTaxaMensal();
        });
    }

    public Conta buscarContaPorNumero(int numero) {
        return contas.stream()
            .filter(c -> c.getNumero() == numero)
            .findFirst()
            .orElseThrow(() -> new RuntimeException("Conta não encontrada"));
    }

}
