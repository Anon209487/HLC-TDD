/**
 * 
 */
package act2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * 
 */
class Act2Test {
	@ParameterizedTest
	@MethodSource("testNumeroPar")
	void testEsPar(int numero, boolean resEsp) {
		boolean resObt = Act2.esPar(numero);
		assertEquals(resEsp, resObt);
	}

	private static Stream<Arguments> testNumeroPar() {
		return Stream.of(Arguments.of(1, false), Arguments.of(2, true), Arguments.of(-1, false), Arguments.of(88, true),
				Arguments.of(-2, true), Arguments.of(-88, true), Arguments.of(0, false));

	}

}
