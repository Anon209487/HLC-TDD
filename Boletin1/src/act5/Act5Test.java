package act5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Act5Test {

	@ParameterizedTest
	@MethodSource("testNumeroCapicua")
	void testEsPar(int numero, boolean resEsp) {
		boolean resObt = Act5.esCapicua(numero);
		assertEquals(resEsp, resObt);
	}

	private static Stream<Arguments> testNumeroCapicua() {
		return Stream.of(Arguments.of(2112, true), Arguments.of(4234, false), Arguments.of(2356, false));

	}
}
