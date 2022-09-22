package exercise_tema_4;

/*Usando un if, crear una condición que compare si 
la variable numeroIf es positivo, negativo, o 0
*/

import java.util.Scanner;

public class Condicional {	
	public static Scanner entrada = new Scanner(System.in);
	
	public static void numeroIf () {
		int numeroIf = 0;
		int neutro = 0;
		
		System.out.print("Digite el número a evaluar: ");
		numeroIf = entrada.nextInt();
		
		if (numeroIf > 100) {
			System.out.println("No se permiten número mayores a 100. Vuelva a ejecutar el programa, por favor");
			System.exit(0);
		}
		if (numeroIf > 0) {
			System.out.println("Número positivo");
		} else if (numeroIf < 0){
			System.out.println("Número negativo");
		} else if (numeroIf == neutro) {
			System.out.println("El número ingresado es cero");
		}
	}
	
	
}
