package functional_interface;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Ana", "Bia", "Carlos", "Daniel", "Elias", "Fabio", "Gustavo", "Hugo",
                "Igor", "João");

        Predicate<String> maisDeCincoCaracteres = nome -> nome.length() > 5;

        nomes.stream()
                .filter(n -> n.length() > 5) // Usando lambda
                .forEach(System.out::println);
    }

}
