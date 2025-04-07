package functional_interface;
import java.util.Arrays;
import java.util.List;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        List<Integer> numero = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
       // BinaryOperator<Integer> somar = Integer::sum; 
        int resultado = numero.stream()
                .reduce(0,Integer::sum);
        System.out.println("A soma dos numeros é: " + resultado); 

    }
}
