package base;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GiocatoreTest {
	@Test
	void cfuInizialiTest() {
		Giocatore giocatore = new Giocatore();
		assertEquals(20, giocatore.getCfu());
	}
	@Test
	void borsaNonNullTest() {
		Giocatore giocatore = new Giocatore();
		assertNotNull(giocatore.getBorsa());
	}
	@Test
	void setCfuTest() {
		Giocatore giocatore = new Giocatore();
		
		giocatore.setCfu(10);
		assertEquals(10, giocatore.getCfu());
	}

}
