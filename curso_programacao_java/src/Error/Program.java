package Error;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        method2();

        System.out.println("Fim do Programa!");

    }

    public static void method1() {


    }

    public static void method2() {
        Scanner sc = new Scanner(System.in);

        System.out.println("*** METHOD 2 STRARTS ***");

        try{
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
            e.printStackTrace();
        }
        catch (InputMismatchException a) {
            System.out.println("input Error");
        }



        sc.close();

        System.out.println("*** METHOD 2 ENDS ***");

    }

}
