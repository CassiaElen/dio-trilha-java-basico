package functional_interface;
import java.util.List;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {
       // Supplier<String> saldacao = () -> "Hello, World!";

        List<String> listaSaudacoes = Stream.generate(() -> "Hello, word!" )
                .limit(5)
                .toList();
        listaSaudacoes.forEach(System.out::println);
    }
}
