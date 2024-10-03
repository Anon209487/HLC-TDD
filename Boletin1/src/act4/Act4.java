/**
 * 
 */
package act4;

/**
 * 
 */
public class Act4 {
/**
 * comprueba si el numero es primo
 * @param numero
 * @return
 */
	public static boolean esPrimo(int numero) {
		boolean res = true;
		if (numero <= 1) {
			res = false;
		}
		for (int i = 2; i <= Math.sqrt(numero); i++) {
			if (numero % i == 0) {
				res = false;
			}
		}
		return res;
	}

}
