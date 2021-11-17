import java.util.Locale;
import java.util.Scanner;

public class Main {

	//Você pode fazer dessa forma ou declarar as variaveis antes
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double calculoLargura = sc.nextDouble();
		double calculoComprimento = sc.nextDouble();
		double calculoMetroQuadrado = sc.nextDouble();
		
		double calculoArea = calculoLargura * calculoComprimento;
		double calculoPreco = calculoArea * calculoMetroQuadrado;
		
		System.out.printf("AREA = %.2f%n", calculoArea);
		System.out.printf("PRECO = %.2f%n", calculoPreco);
		
		sc.close();

	}

}
