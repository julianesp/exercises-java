package exercise_tema_4;

public class BucleWhile {
	
	public static void condicion () {
		int numeroWhile = 0;
		
		while (numeroWhile < 3) {
			System.out.print("Valor de la variable: ");
			numeroWhile++;
			
			if (numeroWhile == 3) {
				System.out.println("El número " + numeroWhile + " llegó a su límite permitido");
			}
		}		
	}
}
