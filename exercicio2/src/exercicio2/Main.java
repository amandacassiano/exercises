package exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String name1 = sc.next();
		int age1 = sc.nextInt();
		String name2 = sc.next();
		int age2 = sc.nextInt();
		
		double media = (age1 + age2) / 2;
		
		System.out.printf("A idade m�dia de %s e %s � de %.1f anos", name1,name2, media);
		
		sc.close();
	}

}
