package act4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Act4Test {

	@ParameterizedTest
	@MethodSource("testNumeroPrimo")
	void testEsPar(int numero, boolean resEsp) {
		boolean resObt = Act4.esPrimo(numero);
		assertEquals(resEsp, resObt);
	}

	private static Stream<Arguments> testNumeroPrimo() {
		return Stream.of(Arguments.of(2, true), Arguments.of(4, false), Arguments.of(-1, false),
				Arguments.of(88, false), Arguments.of(-2, false), Arguments.of(-88, false), Arguments.of(0, false), Arguments.of(7, true));

	}
}
