/**
 * 
 */
package exercise;

import java.util.Locale;
import java.util.Scanner;

/*-O .0 apos o n�mero ser� para indicar que se trata de uma vari�vel double
-se tratando de uma soma onde ambas ser�o multiplicadas e depois somadas, a aplica��o n precisa haver parenteses
-se optar por somar e depois multiplicar, pode colocar em parenteses que podera ser melhor e economiza
-2.0 * largura + 2.0 * largura � uma op��o 
-Math.sqrt(largura * largura + altura * altura);*/
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double altura = sc.nextDouble();
		double larguraBase = sc.nextDouble();
		
		double areaTotal = larguraBase * altura;
		double perimetro = 2.0 * (larguraBase + altura);
		double diagonal = Math.sqrt(Math.pow(altura, 2.0)) + Math.sqrt(Math.pow(larguraBase, 2.0));
		
		System.out.printf("AREA = %.2f%n", areaTotal);
		System.out.printf("PERIMETRO = %.2f%n", perimetro);
		System.out.printf("DIAGONAL = %.2f%n", diagonal);
	
		
		sc.close();

	}

}
