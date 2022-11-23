/**Este programa pide un numero y muestra la primera cifra.
*AmandaNR*/

public class Ejercicio18 {

	public static void main (String [] args) {
	
		int numero;
		System.out.print("Introduce un numero de 5 cifras maximo: ");
		numero = Integer.parseInt(System.console().readLine());
		
		int primera = 0;
		if (numero < 10) {
			primera = numero;
		} if ((numero >= 10) && (numero < 100)) {
			primera = numero / 10;
		} if ((numero >= 100) && (numero < 1000)) {
			primera = numero / 100;
		} if ((numero >= 1000) && (numero < 10000)) {
			primera = numero / 1000;
		} if ((numero >= 10000) && (numero < 100000)) {
			primera = numero / 10000;
		} 
			
		System.out.println("La primera cifra del numero introducido es el "+ primera);
	
	}
}
