package act10;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Act10Test {

	@ParameterizedTest
	@MethodSource("testPalindromo")
	void testEsPar(String palabra, boolean resEsp) {
		boolean resObt = Act10.esPalindromo(palabra);
		assertEquals(resEsp, resObt);
	}

	private static Stream<Arguments> testPalindromo() {
		return Stream.of(Arguments.of("Otto", true),Arguments.of("orro", true), Arguments.of("APPA", true), Arguments.of("HOLA", false),Arguments.of("", true),Arguments.of("Ot o", false),Arguments.of("aaaa", true),Arguments.of("a a a", true));
	}

}
