package act3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Act3Test {

	@ParameterizedTest
	@MethodSource("testMultiplo")
	void testEsVocal(int numero, String resEsp) {
		String resObt = Act3.esMultiplo(numero);
		assertEquals(resEsp, resObt);
	}

	private static Stream<Arguments> testMultiplo() {
		return Stream.of(Arguments.of(3, "fizz"), Arguments.of(5, "buzz"), Arguments.of(15, "fizzbuzz"),
				Arguments.of(0, ""), Arguments.of(4, ""));

	}
}
