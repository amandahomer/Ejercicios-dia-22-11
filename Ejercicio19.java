/**Este programa pide un numero de hasta 5 cifras y muestra cuantos digitos tiene.
*AmandaNR*/

public class Ejercicio19 {

	public static void main (String [] args) {
	
		int numero, numeroFinal;
		System.out.print("Introduce un numero de hasta 5 cifras: ");
		numero = Integer.parseInt(System.console().readLine());
		numeroFinal = Math.abs(numero);
		
		int digitos = 0;
		if (numeroFinal < 10) {
			digitos = 1;
		} if  ((numeroFinal >= 10) && (numeroFinal < 100)) {
			digitos = 2;
		} if  ((numeroFinal >= 100) && (numeroFinal < 1000)) {
			digitos = 3;
		} if  ((numeroFinal >= 1000) && (numeroFinal < 10000)) {
			digitos = 4;
		} if  ((numeroFinal >= 10000) && (numeroFinal < 100000)) {
			digitos = 5;
		}
		
		System.out.println("El numero introducido tiene "+ digitos +" digitos.");
	
	}
}
