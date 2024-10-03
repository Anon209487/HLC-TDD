package act8;

public class Act8 {
	/**
	 * funcion que comprueba si es fibbonacy
	 * 
	 * @param numero
	 * @return
	 */
	public static boolean esFibonacci(int numero) {
		boolean res = false;
		if (numero > 1) {
			res = esCuadradoPerfecto(5 * numero * numero + 4) || esCuadradoPerfecto(5 * numero * numero - 4);
		} else {
			throw new IllegalArgumentException("Numero menor que 1: " + numero);
		}
		return res;
	}

	/**
	 * funcion que compueba si es un cuadradi perfecto
	 * 
	 * @param n
	 * @return
	 */
	private static boolean esCuadradoPerfecto(int n) {
		boolean res;
		int raiz = (int) Math.sqrt(n);
		res = raiz * raiz == n;
		return (res);
	}

}
