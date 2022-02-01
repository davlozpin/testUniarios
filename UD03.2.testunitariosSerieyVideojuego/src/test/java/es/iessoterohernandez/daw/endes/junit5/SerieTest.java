package es.iessoterohernandez.daw.endes.junit5;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SerieTest {

	Serie s = new Serie("La casa de papel", 2, "Acción", "Netflix");
	Serie s1 = new Serie("Peaky bleanders", 3, "Acción", "Netflix");
	Serie s2 = new Serie();

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
	void testEntregar() {
		s.entregar();
		Assert.assertEquals(true, s.isEntregado());

	}

	@Test
	void testDevolver() {
		s.entregar();
		Assert.assertEquals(false, s.isEntregado());

	}

	@Test
	void testCompareTo() {
		Assert.assertEquals(Serie.MENOR, s.compareTo(s1));
		Assert.assertEquals(Serie.MAYOR, s1.compareTo(s));
		s2.setnumeroTemporadas(3);
		Assert.assertEquals(Serie.IGUAL, s2.compareTo(s1));
	}

	@Test
	void testToString() {
		Assert.assertEquals("Informacion de la Serie: \n" + "\tTitulo: " + s.getTitulo() + "\n"
				+ "\tNumero de temporadas: " + s.getnumeroTemporadas() + "\n" + "\tGenero: " + s.getGenero() + "\n"
				+ "\tCreador: " + s.getcreador(), s.toString());
	}

}
