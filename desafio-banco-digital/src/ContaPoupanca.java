public class ContaPoupanca extends Conta {
    private static final double TAXA_RENDIMENTO = 0.005;

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void renderJuros() {
        double rendimento = getSaldo() * TAXA_RENDIMENTO;
        depositar(rendimento);
        historicoTransacoes.add("Rendimento poupança: +" + rendimento);
    }

    @Override
    protected String getTipo() {
        return "Conta Poupança";
    }

    @Override
    public void aplicarTaxaMensal() {
        this.renderJuros();
    }

    @Override
    public double consultarSaldo() {
        return getSaldo();
    }
}