import java.util.Iterator;
import java.util.Scanner;

public class Presentacion {

	public static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		int opcion = 0;
		
		do {
			System.out.println("Ejercicios tema 3\n");
			System.out.println("1. Primera parte");
			System.out.println("2. Segunda parte");
			System.out.println("3. Salir");
			System.out.println("");
			System.out.print("Digite una opción: ");
			opcion = entrada.nextInt();
			
			//Switch para numerar ejercicios
			switch (opcion) {
			case 1: 
				int n1= 0,
					n2 = 0,
					n3 = 0;
				sumar(n1,n2,n3);				
				break;
			case 2:
				coche();
				break;
			case 3:
				System.out.println("Hasta luego");
				System.exit(0);
			}
		} while (opcion != 0);
		
	}
	
	public static int sumar(int n1, int n2, int n3) {
		System.out.print("Digite el primer valor: ");
		n1 = entrada.nextInt();
		System.out.print("Digite el segundo valor: ");
		n2 = entrada.nextInt();
		System.out.print("Digite el tercer valor: ");
		n3 = entrada.nextInt();
		
		int resultado = n1 + n2 + n3;
		
		System.out.println("\nEl resultado de la suma es: " + resultado + "\n");
		
		return (resultado);
	}
	
	public static void coche() {
		Coche miCoche = new Coche();
		
		for (int i = 0; i < 1; i++) {
			miCoche.incrementarPuertas();
		}
		
		System.out.println("\nPuertas añadidas: " + miCoche.incrementarPuertas() + "\n");
	}
}
