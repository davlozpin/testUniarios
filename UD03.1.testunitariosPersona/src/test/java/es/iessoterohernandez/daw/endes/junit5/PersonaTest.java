package es.iessoterohernandez.daw.endes.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTest {

	Persona p = new Persona("Pepe", 36, 'H', 79.5, 179.2);

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCalcularIMC() {
		Assert.assertEquals(p.calcularIMC(), 1);
	}

	@Test
	void testEsMayorDeEdad() {
		Assert.assertTrue(p.esMayorDeEdad());
	}

	@Test
	void testToString() {
		Assert.assertEquals(p.toString(), 'H');
	}

}
