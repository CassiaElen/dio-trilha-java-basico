package functional_interface;
import java.util.Arrays;
import java.util.List;

public class ConsumerExample {
    public static void main(String[] args) throws Exception {
        List<Integer> numero = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        /*Consumer<Integer> imprimirNumeroPar = num -> {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        };*/
        numero.stream()  
            .filter(n-> n  % 2 == 0) // Usando lambda
            .forEach(System.out::println); // Usando lambda
    }
}
