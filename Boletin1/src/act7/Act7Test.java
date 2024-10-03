package act7;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Act7Test {

	@ParameterizedTest
	@MethodSource("testFecha")
	void testEsPar(int dia, int mes, int anyo, boolean resEsp) {
		boolean resObt = Act7.esCorrecta(dia, mes, anyo);
		assertEquals(resEsp, resObt);
	}

	private static Stream<Arguments> testFecha() {
		return Stream.of(Arguments.of(23, 4, 2000, true), Arguments.of(44, 4, 2000, false),
				Arguments.of(2, 13, 3000, false), Arguments.of(4, 2, 0, false));

	}
}
