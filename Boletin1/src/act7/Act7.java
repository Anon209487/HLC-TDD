package act7;

public class Act7 {
	/**
	 * funcion que verifica la fecha
	 * 
	 * @param dia
	 * @param mes
	 * @param anyo
	 * @return
	 */
	public static boolean esCorrecta(int dia, int mes, int anyo) {
		boolean res = true;

		if (mes > 12 || mes < 1) {
			res = false;
		}
		if (anyo <= 1900) {
			res = false;
		}
		if (mes == 4 || mes == 6 || mes == 8 || mes == 11) {
			if (dia > 30 || dia < 1) {
				res = false;
			}
		} else if (mes == 2) {
			if (dia > 28 || dia < 1) {
				res = false;
			}
		} else {
			if (dia > 31 || dia < 1) {
				res = false;
			}
		}
		return res;
	}

}
