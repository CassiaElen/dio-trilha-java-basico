public class Operadores {

    public static void main(String[] args) {
        // concatenação
        String nomeCompleto = "Linguagem" + "Java";
        System.out.println(nomeCompleto);
        //Operador aritmético
        int numero = 5;

        numero = -numero;

        System.out.println(-numero);

        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero);

        int numero2 = 5;

        numero2 = numero2 + 2;

        System.out.println(numero2);
        // incremento
        numero2++;
        System.out.println(numero2);

        System.out.println(++numero2);

        boolean variavel = true;
        System.out.println(!variavel);
        System.out.println(variavel);

        //Ternário
        int a, b;

        a=5;
        b=6;

        String resultado = a==b ? "Verdadeiro":"Falso";

        int resultado2 = a==b ? 1:0;

        System.out.println(resultado + "," + resultado2);

        //boolean

        int numero3 = 1;
        int numero4 = 2;

        boolean simNao = numero3 == numero4;

        System.out.println("numeroTres é igual a numeroQuatro? " + simNao);

        simNao = numero3 != numero4;

        System.out.println("numeroTres é diferente a numeroQuatro? " + simNao);

        simNao = numero3 > numero4;

        System.out.println("numeroTres é maior a numeroQuatro? " + simNao);

        String nomeUm = "Janicleia";
        String nomeDois = "Janicleia";
        String nomeTres = new String("Janicleia");

        System.out.println(nomeUm == nomeDois);
        System.out.println(nomeUm == nomeTres);
        System.out.println(nomeUm.equals(nomeTres));

        //operadores lógicos

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("as duas são verdadeiras");
        }else if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }
        System.out.println("Fim");
    }
    
}
