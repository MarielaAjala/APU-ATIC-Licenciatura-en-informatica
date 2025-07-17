package ar.edu.unlp.info.oo1.ejercicio16filteredset;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EvenNumberSetTest {
	EvenNumberSet numbers = new EvenNumberSet();
	// inicialmente el Set está vacío => []
	@BeforeEach
	void setUp() {
		numbers.add(1); // No es par, entonces no se agrega => []
		numbers.add(2); // Es par, se agrega al set => [2]
		numbers.add(4); // Es par, se agrega al set => [2, 4]
		numbers.add(2); // Es par, pero ya está en el set, no se agrega => [2, 4
	}
	@Test
	public void addTest() {
		assertTrue(numbers.contains(2));
		assertFalse(numbers.contains(1));
		assertTrue(numbers.contains(4));
	}
}
