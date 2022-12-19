import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double cont = 0;
		double c1, c2, s;

		System.out.println("------------------------");
		System.out.println("  CONTADOR INTELIGENTE  ");
		System.out.println("------------------------");
		System.out.println("   ");
		System.out.print("Conte de: ");
		c1 = sc.nextDouble();
		System.out.print("Até: ");
		c2 = sc.nextDouble();
		System.out.print("Na sequencia de: ");
		s = sc.nextDouble();
		System.out.println("Contando de " + s + " em " + s);
		System.out.println("   ");
		cont = c1;
		if (c1 < c2) {
			while (cont <= c2) {
				System.out.println(cont);
				cont += s;
			}
		} else {
			while (cont >= c2) {
				System.out.println(cont);
				cont = cont - s;
			}
		}
		System.out.println("   ");
		System.out.println("Terminei de contar...");

		sc.close();
	}
}