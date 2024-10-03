/**
 * 
 */
package act2;

/**
 * 
 */
public class Act2 {
	/**
	 * comprueba que el numero es un numero par
	 * @param numero
	 * @return
	 */
	public static boolean esPar(int numero) {
		boolean res = false;
		if (numero != 0 && numero % 2 == 0) {
			res = true;
		}
		return res;
	}

}
