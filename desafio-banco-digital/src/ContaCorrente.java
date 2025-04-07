public class ContaCorrente extends Conta{
    private double limiteEspecial;
    private double taxaManutencao;

    public ContaCorrente(Cliente cliente, double limiteEspecial, double taxaManutencao) {
        super(cliente);
        this.limiteEspecial = limiteEspecial;
        this.taxaManutencao = taxaManutencao;
    }

    @Override
    public void sacar(double valor) {
        double saldoDisponivel = saldo + limiteEspecial;
        if (valor > saldoDisponivel) {
            System.out.println("Saldo insuficiente!");
            return;
        } else if (valor <= 0) {
            System.out.println("Valor inválido para saque!");
            return;
        }else{
            saldo -= valor;
            historicoTransacoes.add("Saque: -" + valor);
        }
    }

    @Override
    public void aplicarTaxaMensal() {
        if (saldo < 0) {
           double juros = Math.abs(saldo) * 0.02; // 2% de juros sobre o saldo negativo
            saldo -= juros;
            historicoTransacoes.add("Juros cheque especial: -" + juros);
        } else {
            saldo -= taxaManutencao;
            historicoTransacoes.add("Taxa de Manutenção: -" + taxaManutencao);
        }
    }

    @Override
    protected String getTipo() {
        return "Conta Corrente";
    }

    public void aumentarLimite(double valor) {
        limiteEspecial += valor;
    }

    @Override
    public double consultarSaldo() {
        return getSaldo();
    }

    @Override
    public void renderJuros() {
        
    }

}
