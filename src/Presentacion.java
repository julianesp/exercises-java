import java.util.Iterator;
import java.util.Scanner;

public class Presentacion {

	public static Scanner escaner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("El resultado de la suma es: " + sumar(1,2,2));
		
		Coche miCoche = new Coche();
		
//		System.out.println("Antes de empezar el ciclo for: " + miCoche.incrementarPuertas());
		
		for (int i = 0; i < 1; i++) {
			miCoche.incrementarPuertas();
		}
		
		System.out.println("Puertas añadidas: " + miCoche.incrementarPuertas());
		
	}
	
	public static int sumar(int n1, int n2, int n3) {		
		int resultado = n1 + n2 + n3;		
		return resultado;
	}

}
