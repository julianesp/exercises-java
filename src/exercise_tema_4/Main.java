package exercise_tema_4;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Condicional numero = new Condicional();
		numero.numeroIf();
		
		int opc = 0;
		do {
			System.out.println("¡Quiere volver a ejecutar? 1=si / 2=no");
			opc = entrada.nextInt();
			
			while (opc == 1) {
				System.out.println("¡Quiere volver a ejecutar? 1=si / 2=no");
				opc = entrada.nextInt();
				
				if (opc == 1) {
					numero.numeroIf();				
				}
			}			
			
			if (opc == 2) {
				System.out.println("Hasta luego");
				System.exit(0);
			}				
			
		} while (numero.equals(-1));
		
	}	
}
