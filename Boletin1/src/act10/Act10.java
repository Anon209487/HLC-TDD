package act10;

public class Act10 {

	/**
	 * compara la palabra con la palabra sin invertir
	 * 
	 * @param palabra
	 * @return
	 */
	public static boolean esPalindromo(String palabra) {
		boolean res = false;
		String palabrainvertida = "";
		if (!palabra.equals("") || palabra != null) {
			palabra = palabra.toLowerCase();
			palabrainvertida = palabraInvertida(palabra);
			if (palabrainvertida.equals(palabra)) {
				res = true;
			}
		}
		return res;

	}

	/**
	 * invierte la palabra
	 * 
	 * @param palabra
	 * @return
	 */
	public static String palabraInvertida(String palabra) {
		String palabrainvertida = "";
		char letras[] = palabra.toCharArray();
		for (int i = letras.length - 1; i >= 0; i--) {
			palabrainvertida += String.valueOf(letras[i]);

		}

		return palabrainvertida;
	}

}
