/* & evalua las 2 condiciones 
 * y && evalua primero la de la izquierda 
 * y si se cumple no lee la segunda.
 * 
 * Para el | y || pasa lo mismo que con el & 
 * 
 */
public class OperadoresBoleanos {
	public static void main(String[] args) throws InterruptedException {
		char letraA = 'A';
		char letraB = 'B';

		if (esLetraA(letraB) && esLetraB(letraB)) {
			System.out.println("Estoy dentro");
		} else {
			System.out.println("No entro");
		}

		Thread.sleep(4000);

		if (esLetraA(letraB) & esLetraB(letraB)) {
			System.out.println("Estoy dentro");
		} else {
			System.out.println("No entro");
		}

		Thread.sleep(4000);

		if (esLetraA(letraA) || esLetraB(letraA)) {
			System.out.println("Estoy dentro");
		} else {
			System.out.println("No entro");
		}

		Thread.sleep(4000);

		if (esLetraA(letraA) | esLetraB(letraA)) {
			System.out.println("Estoy dentro");
		} else {
			System.out.println("No entro");
		}
	}

	public static boolean esLetraA(char letra) {
		boolean devuelve = false;
		if (letra == 'A') {
			System.out.println("Es  la letra A");
			devuelve = true;
		} else {
			System.out.println("No es la letra A");
		}
		return devuelve;
	}

	public static boolean esLetraB(char letra) {
		boolean devuelve = false;
		if (letra == 'B') {
			System.out.println("Es  la letra B");
			devuelve = true;
		} else {
			System.out.println("No es la letra B");
		}
		return devuelve;
	}

}
