package es.iessoterohernandez.daw.endes.junit5;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VideojuegoTest {

	Videojuego v = new Videojuego("Juego1", 200, "Acción", "Samsung");
	Videojuego v1 = new Videojuego("Juego2", 350, "Acción", "Ejemplo");
	Videojuego v2 = new Videojuego();

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

	void testEntregar() {
		v.entregar();
		Assert.assertEquals(true, v.isEntregado());

	}

	@Test
	void testDevolver() {
		v.entregar();
		Assert.assertEquals(false, v.isEntregado());

	}

	@Test
	void testCompareTo() {
		Assert.assertEquals(Videojuego.MENOR, v.compareTo(v1));
		Assert.assertEquals(Videojuego.IGUAL, v.compareTo(v1));
		Assert.assertEquals(Videojuego.MAYOR, v.compareTo(v1));
	}

	@Test
	void testToString() {
		Assert.assertEquals("Informacion del videojuego: \n" + "\tTitulo: " + v.getTitulo() + "\n"
				+ "\tHoras estimadas: " + v.getHorasEstimadas() + "\n" + "\tGenero: " + v.getGenero() + "\n"
				+ "\tcompañia: " + v.getcompañia(), v.toString());
	}

	@Test
	void testEqualsVideojuego() {
		Assert.assertEquals(false, v.equals(v1));
		v2.setTitulo("Samsung");
		v2.setcompañia("Samsung");
		Assert.assertEquals(true, v.equals(v2));

	}

}
