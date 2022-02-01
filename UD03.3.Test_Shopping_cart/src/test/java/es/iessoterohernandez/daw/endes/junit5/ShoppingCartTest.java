package es.iessoterohernandez.daw.endes.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShoppingCartTest {

	ShoppingCart s = new ShoppingCart();

	@Test

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
	void testShoppingCart() {
		s.addItem(null);
	}

	void testGetBalance() {
		assertEquals(10, s.getBalance());
	}

	@Test
	void testAddItem() {
		Product p = new Product("Pan", 2);
		s.addItem(p);
	}

	// @Test
	// void testRemoveItem() {
	// Product p = new Product("Pan",2);
	// s.removeItem(null);
	// }

	@Test
	void testGetItemCount() {
		assertEquals(1, s.getItemCount());
	}

	@Test
	void testEmpty() {
		s.empty();
	}

}
