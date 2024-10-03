package act5;

public class Act5 {
/**
 * funcion que veifica si es capicua
 * @param numero
 * @return
 */
	public static boolean esCapicua(int numero) {
		boolean res = false;
		String numeroCadena = String.valueOf(numero);
		String numeroCadenainvertida = numeroInvertido(numeroCadena);
		if (numeroCadenainvertida.equals(numeroCadena)) {
			res = true;
		}
		return res;
	}
/**
 * invierte una cadena pansadola a char array 
 * @param numero
 * @return
 */
	public static String numeroInvertido(String numero) {
		String numeroCadenainvertida = "";
		char numeros[] = numero.toCharArray();
		for (int i = numeros.length - 1; i >= 0; i--) {
			numeroCadenainvertida += String.valueOf(numeros[i]);

		}

		return numeroCadenainvertida;
	}

}
