package act3;

public class Act3 {
/**
 * comprueba si el numero es multiplo de 5 y 3
 * @param numero
 * @return
 */
	public static String esMultiplo(int numero) {
		String res = "";
		if (numero != 0) {
			if (numero % 3 == 0) {
				res += "fizz";
			}
			if (numero % 5 == 0) {
				res += "buzz";
			}
		}
		return res;
	}

}
