package exercise_tema_3;
import java.util.Scanner;

public class Coche {
	public static Scanner entrada = new Scanner(System.in);
	
//	variable numérica
	public static int puertas = 0;
	
	public static int incrementarPuertas() {
		if (puertas == 0) {
			System.out.println("Cuantas puertas quiere agregar?");
			puertas = entrada.nextInt();
			
			System.out.println("Agregó " + puertas + " puertas");			
		}		
		return puertas;
	}
}
