package utilidades;

public class Cadena {
	
	public static String inicialEnMayuscula(String cadena) {
		String primeMayus="";
		String cadenaMayus = cadena.toUpperCase();
		String cadenaMinus = cadena.toLowerCase();
		String restanteCadena="";
		String cadenaTotal="";
		
		primeMayus += cadenaMayus.charAt(0);
		restanteCadena += cadenaMinus.substring(1);
		cadenaTotal += primeMayus + restanteCadena;
		
		return cadenaTotal;
	}
	
	public static String camelCase(String cadena) {
		String[] array;
		array = cadena.split(" ");
		
		String cadenaTotal = "";
		for(int i = 0; array.length>i; i++) {
			if(array[i].equals(array[0])) {
				array[i] = array[i].toLowerCase();
				cadenaTotal += array[i];
			} else {
				cadenaTotal += inicialEnMayuscula(array[i]);
			}
		}
		return cadenaTotal;
	}
	public static void main(String[] args) {
		
		System.out.println(inicialEnMayuscula(
				"PIROAS rsposrj asrPRISRNAs RRSins"));
		
		System.out.println(camelCase("TUN pARE nO tE nAS"));
	}

}
