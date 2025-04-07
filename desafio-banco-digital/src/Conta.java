import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements IConta {
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected final int AGENCIA_PADRAO = 1;
    protected static int SEQUENCIAL = 1;

    protected List<String> historicoTransacoes = new ArrayList<>();

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public void sacar(double valor) {
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente!");
            return;
        } else if (valor <= 0) {
            System.out.println("Valor inválido para saque!");
            return;
        }else{
            this.saldo -= valor;
            historicoTransacoes.add("Saque: -" + valor);
        }
    }

    @Override
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para depósito!");
            return;
        }else{
            this.saldo += valor;
            historicoTransacoes.add("Depósito: +" + valor);
        }
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente!");
            return;
        } else if (valor <= 0) {
            System.out.println("Valor inválido para transferência!");
            return;
        }else{
            this.saldo -= valor;
            contaDestino.depositar(valor);
            historicoTransacoes.add("Transferência para conta " + ((Conta)contaDestino).getNumero() + ": -" + valor);        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\n=== Extrato da Conta "+ this.getTipo() +" ===");
        System.out.println("Titular: " + this.cliente.getNome());
        System.out.println("Agência: " + this.agencia);
        System.out.println("Número: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("\nHistórico de Transações:");
        historicoTransacoes.forEach(System.out::println);
        }
    // Retorna o tipo de Conta 
    protected abstract String getTipo();
}
