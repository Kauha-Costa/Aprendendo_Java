package Comeco;
import java.util.Locale;
import java.util.Scanner;

public class AtividadesEntradas04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int number;
		int horas;
		double porHora;
		
		double salario;
		
		
		
		number = sc.nextInt();
		horas = sc.nextInt();
		porHora = sc.nextDouble();
		
		salario = horas * porHora;
		
		
		
		System.out.println("Number = " + number);
		System.out.printf("Salary = U$ %.2f%n", salario);
		
		sc.close();
	}

}
