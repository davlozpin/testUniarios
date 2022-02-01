package es.iessoterohernandez.daw.endes.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductTest {

	Product p = new Product("Pan", 2);
	Product p1 = new Product("Agua", 1);
	Product p2 = new Product("Pan", 2);

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
	void testGetTitle() {
		assertEquals("Pan", p.getTitle());
	}

	@Test
	void testGetPrice() {
		assertEquals("2", p.getPrice());
	}

	@Test
	void testEqualsObject() {
		assertEquals(true, p.equals(p2));
		assertEquals(false, p.equals(p1));
	}

}
