public class App {
    public static void main(String[] args) throws Exception {
        Banco banco = new Banco();
        banco.setNome("Banco Digital");
        
        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00");
        Cliente cliente2 = new Cliente("Maria Souza", "987.654.321-00");
        
        Conta cc = new ContaCorrente(cliente1, 1000, 20);
        Conta poupanca = new ContaPoupanca(cliente1);
        Conta cc2 = new ContaCorrente(cliente2, 500, 15);
        
        banco.adicionarConta(cc);
        banco.adicionarConta(poupanca);
        banco.adicionarConta(cc2);
        
        cc.depositar(1000);
        cc.transferir(500, poupanca);
        poupanca.renderJuros();
        
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        
        banco.listarClientes();
        cliente1.listarContas();
        
        banco.aplicarTaxasERendimentos();
    }
}
