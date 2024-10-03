package act6;

public class Act6 {
/**
 * funcion que hace de calculadora con 4 operaciones basicas
 * @param x
 * @param y
 * @param oper
 * @return
 */
	public static int calculadora(int x, int y, int oper) {
		int res;
		switch (oper) {
		case 1: {
			res = x + y;
			break;
		}
		case 2: {
			res = x - y;
			break;
		}
		case 3: {
			res = x * y;
			break;
		}
		case 4: {
			res = x / y;
			break;
		}
		default:
			res = 0;
			break;
		}
		return res;
	}

}
