/**Este programa pinta una piramide rellena con un caracter introducido por teclado.
*AmandaNR*/

public class Ejercicio15 {

	public static void main (String [] args) {
	
		String c;
		int opcion;
		
		System.out.print("Introduce cualquier letra, numero o caracter: ");
		c = System.console().readLine();
		
		System.out.println("Elige un tipo de piramide:");
		System.out.println("1. Vertice hacia arriba");
		System.out.println("2. Vertice hacia abajo");
		System.out.println("3. Vertice hacia la izquierda");
		System.out.println("4. Vertice hacia la derecha");
		opcion = Integer.parseInt(System.console().readLine());
		
		switch (opcion) {
			case 1:
				System.out.println("  "+ c);
				System.out.println(" "+ c + c + c);
				System.out.println(c + c + c + c + c);
			break;
			case 2:
				System.out.println(c + c + c + c + c);
				System.out.println(" "+ c + c + c);
				System.out.println("  "+ c);
			break;
			case 3:
				System.out.println("   "+ c + c);
				System.out.println("  "+ c + c + c);
				System.out.println(c + c + c + c + c);
				System.out.println("  "+ c + c + c);
				System.out.println("   "+ c + c);
			break;
			case 4:
				System.out.println(c + c);
				System.out.println(c + c + c +" ");
				System.out.println(c + c + c + c);
				System.out.println(c + c + c +" ");
				System.out.println(c + c);
			break;
			default:
		}
	}
}
