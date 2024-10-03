package act6;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Act6Test {

	@ParameterizedTest
	@MethodSource("testNumeroPrimo")
	void testEsPar(int x, int y, int oper, int resEsp) {
		int resObt = Act6.calculadora(x, y, oper);
		assertEquals(resEsp, resObt);
	}

	private static Stream<Arguments> testNumeroPrimo() {
		return Stream.of(Arguments.of(2, 4, 1, 6), Arguments.of(2, 4, 2, -2), Arguments.of(2, 4, 3, 8),
				Arguments.of(4, 2, 4, 2), Arguments.of(4, 2, 5, 0));

	}
}
