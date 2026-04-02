package base;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LabirintoTest {

	@Test
	void stanzaInizialeTest() {
		Labirinto labirinto = new Labirinto();
		
		assertNotNull(labirinto.getStanzaIniziale()); //controlla che non sia null		
	}
	@Test
	void stanzaFinaleTest() {
		Labirinto labirinto = new Labirinto();
		
		assertNotNull(labirinto.getStanzaFinale());
	}
	@Test
	void stanzaInzialeCorrettaTest() {
		Labirinto labirinto = new Labirinto();
		assertEquals("Atrio", labirinto.getStanzaIniziale().getNome());
	}
	@Test
	void stanzaFinaleCorrettaTest() {
		Labirinto labirinto = new Labirinto();
		assertEquals("Biblioteca", labirinto.getStanzaFinale().getNome());
	}
}
