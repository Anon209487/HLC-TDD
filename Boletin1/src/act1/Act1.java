/**
 * 
 */
package act1;

/**
 * 
 */
public class Act1 {
	
	/**
	 * Comprueba si el char es una vocal o no 
	 * @param caracter
	 * @return
	 */
	public static boolean esVocal(char caracter) {
		char caracterMinus = Character.toLowerCase(caracter);
		boolean res = false;

		switch (caracterMinus) {
		case 'a', 'e', 'i', 'o', 'u': {
			res = true;
		}

		}
		return res;
	}
}
