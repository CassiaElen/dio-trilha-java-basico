package iPhone;

public class Main {
	public static void main(String[] args) {
        IPhone meuIPhone = new IPhone();
        
        meuIPhone.selecionarMusica("Por Que Homem Não Chora");
        meuIPhone.tocar();
        meuIPhone.pausar();
        
        meuIPhone.ligar("123456789");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();
        
        meuIPhone.exibirPagina("https://www.google.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}
