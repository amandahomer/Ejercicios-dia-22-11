/**Este programa pide un numero y muestra la utlima cifra.
*AmandaNR*/

public class Ejercicio17 {

	public static void main (String [] args) {
	
		int numero;
		System.out.print("Introduce un numero: ");
		numero = Integer.parseInt(System.console().readLine());
		
		System.out.println("La última cifra del numero introducido es el "+ numero % 10);
		
	}
}
