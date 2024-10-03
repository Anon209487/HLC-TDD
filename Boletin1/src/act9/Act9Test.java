package act9;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;



class Act9Test {
	@ParameterizedTest
	@MethodSource("testBinario")
	void testEsPar(int numero, int resEsp) {
		int resObt = Act9.convertirABinario(numero);
		assertEquals(resEsp, resObt);
	}

	private static Stream<Arguments> testBinario() {
		return Stream.of(Arguments.of(10, 101), Arguments.of(44, 12542));

	}

}
