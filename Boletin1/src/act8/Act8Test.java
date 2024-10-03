package act8;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Act8Test {

	@ParameterizedTest
	@MethodSource("testFibonnaci")
	void testEsPar(int numero, boolean resEsp) {
		boolean resObt = Act8.esFibonacci(numero);
		assertEquals(resEsp, resObt);
	}

	private static Stream<Arguments> testFibonnaci() {
		return Stream.of(Arguments.of(1597, true), Arguments.of(44, false));

	}

}
