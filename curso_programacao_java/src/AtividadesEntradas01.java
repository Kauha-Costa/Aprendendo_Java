import java.util.Locale;
import java.util.Scanner;

public class AtividadesEntradas01 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio;
		double pi;
		
		double quadrado;
		double x;
		
		
		
		raio = sc.nextDouble();
		
		quadrado = raio * raio;
		pi = 3.14159;
		x = quadrado * pi;
		
		
		System.out.printf("Área do círculo: " + x);
		
		sc.close();
	}
}
