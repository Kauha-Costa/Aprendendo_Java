package Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Program {
    public static void main(String[] args) {
         List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("HD", 20.00));
        list.add(new Product("Cabo VGA", 50.00));

        double factor = 1.10;

        list.forEach(p -> p.setPrice(p.getPrice() * factor)); // aumneto de 10% em cada produto

        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList()); // letras maiusculas, para imprimir apenas nomes

        list.forEach(p -> p.setName(p.getName().toUpperCase())); // letras maiusculas para imprimir junto com o preço

        list.forEach(System.out::println); // imprime a lista

        names.forEach(System.out::println); // imprime apenas os nomes
    }
}

