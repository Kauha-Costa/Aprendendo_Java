package Lists;
import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();

        list.add("Manuela");
        list.add("Kauha");
        list.add("Frank");
        list.add("Luma");
        list.add("Lucas");
        list.add(2, "Salem");

        System.out.println(list.size());

       


        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-------------------------------");

        list.remove("Kauha"); // ou pode ser com numero do lugar da lista
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-------------------------------");

        System.out.println("Index of Frank: " + list.indexOf("Luma"));

        System.out.println("-------------------------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'L').collect(Collectors.toList());
        for (String x : result){
            System.out.println(x);
        }

        System.out.println("-------------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'L').findFirst().orElse(null);
        System.out.println(name);
    }
}
