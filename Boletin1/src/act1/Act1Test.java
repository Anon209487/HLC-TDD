package act1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Act1Test {
	@ParameterizedTest
	@MethodSource("testVocal")
	void testEsVocal(char cracter, boolean resEsp) {
		boolean resObt = Act1.esVocal(cracter);
		assertEquals(resEsp, resObt);
	}

	private static Stream<Arguments> testVocal() {
		return Stream.of(Arguments.of('a', true), Arguments.of('E', true), Arguments.of('I', true),
				Arguments.of('O', true), Arguments.of('U', true), Arguments.of('F', true));

	}

/*
	@Test
	void testVocalA() {
		boolean resul = Act1.esVocal('a');
		assertTrue(resul);
	}

	void testVocalE() {
		boolean resul = Act1.esVocal('E');
		assertTrue(resul);
	}

	void testVocalI() {
		boolean resul = Act1.esVocal('I');
		assertTrue(resul);
	}

	void testVocalO() {
		boolean resul = Act1.esVocal('O');
		assertTrue(resul);
	}

	void testVocalU() {
		boolean resul = Act1.esVocal('U');
		assertTrue(resul);
	}

	void testVocalN() {
		boolean resul = Act1.esVocal('F');
		assertFalse(resul);
	}
	*/
}
