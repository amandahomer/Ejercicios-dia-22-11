/**Este programa dice si el numero introducido es par y/o divisible entre 5.
*AmandaNR*/

public class Ejercicio14 {

	public static void main (String [] args) {
	
		String dato;
	
		System.out.print("Introduce un numero para saber si es par y/o divisible entre 5: ");
		dato = System.console().readLine();
		int numero = Integer.parseInt( dato );
		
		if (numero % 2 == 0) {
			System.out.print("El numero "+ numero +" es par ");
		} else {
			System.out.print("El numero "+ numero +" no es par ");
		}
			
		if (numero % 5 == 0) {
			System.out.print("y es divisible entre 5.");
		} else {
			System.out.print("y no es divisible entre 5.");
		}
	}
}
