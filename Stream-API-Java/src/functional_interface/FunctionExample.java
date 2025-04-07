package functional_interface;
import java.util.Arrays;
import java.util.List;

public class FunctionExample {
    public static void main(String[] args) {
        List<Integer> numero = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
     //   Function<Integer, Integer> dobrar = numero -> numero * 2;

        List<Integer> numerosDobrados = numero.stream()
                .map(n -> n*2) // Usando lambda
                .toList();

        numerosDobrados.forEach(System.out::println);
    }
}
