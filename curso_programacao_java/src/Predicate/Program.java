package Predicate;

import java.util.ArrayList;
import java.util.List;


public class Program {
    public static void main(String[] args) {
         List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("HD", 20.00));
        list.add(new Product("Cabo VGA", 50.00));

        double min = 100.0;

        list.removeIf(p -> p.getPrice() >= min);

        

        for (Product p : list) {
            System.out.println(p);
        }
    }
}

