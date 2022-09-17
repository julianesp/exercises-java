package exercise_tema_4;

import java.util.Scanner;

public class Condicional {	
	public static Scanner entrada = new Scanner(System.in);
	
	public static void numeroIf () {
		int numeroIf = 0;
		
		System.out.print("Digite el número a evaluar: ");
		numeroIf = entrada.nextInt();
		
		if (numeroIf >= 0) {
			System.out.println("Número positivo");
		} else if (numeroIf < 0){
			System.out.println("Número negativo");
		}
	}
}
