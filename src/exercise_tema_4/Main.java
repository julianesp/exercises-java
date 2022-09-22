package exercise_tema_4;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		int opc = 0;
		
		do {
			// Menú de ejercicios
			System.out.println("Menú:\n");
			System.out.println("1. Condicional if");
			System.out.println("2. Bucle While");
			System.out.println("3. Buble Do - While");
			System.out.println("4. Bucle For");
			System.out.println("5. Estructura condicional Switch");
			System.out.println("6. Salir");
			System.out.print("\nElija la opción a ejecutar:");
			opc = entrada.nextInt();
			
			switch (opc) {
			case 1:
				evaluarSigno();
				break;
			case 2:
				evaluarSigno();
				break;
			case 3:
				evaluarSigno();
				break;
			case 4:
				evaluarSigno();
				break;
			case 5:
				evaluarSigno();
				break;
			case 6:
				System.exit(0);
				break;
				
			default:
				System.out.println("\nIngresaste una opción incorrecta. \nVuelve a elegir\n");
				break;
			}			
		} while (opc != -1000);
	}	
	
	public static void evaluarSigno () {
		int opc = 0;
		
		Condicional numero = new Condicional();
		numero.numeroIf();
		
		do {
			System.out.println("¡Quiere volver a ejecutar? 1=si / 2=no");
			opc = entrada.nextInt();
			
			while (opc == 1) {
				numero.numeroIf();
				
				System.out.println("¡Quiere volver a ejecutar? 1=si / 2=no");
				opc = entrada.nextInt();
			}			
			if (opc == 2) {
				System.out.println("Hasta luego");
				System.exit(0);
			}			
		} while (opc != -10000);
	}
}
