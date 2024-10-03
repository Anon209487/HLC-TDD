package act9;

public class Act9 {
/**
 * pasa un numero a binario
 * @param numero
 * @return
 */
	public static int convertirABinario(int numero) {
		String binario = "";
		int res;
		while (numero > 0) {
			res = numero % 2;
			binario += String.valueOf(res);
			numero = numero / 2;
		}

		return Integer.parseInt(binario);
	}
}
