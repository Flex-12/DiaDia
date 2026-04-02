package base;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BorsaTest {

	@Test
	void addAttrezzoTest() {
		Borsa borsa = new Borsa();
		Attrezzo a = new Attrezzo("lanterna", 3);
		
		boolean risultato = borsa.addAttrezzo(a);
		assertTrue(risultato);
		assertTrue(borsa.hasAttrezzo("lanterna"));
	}
	@Test
	void removeAttrezzoTest() {
		Borsa borsa = new Borsa();
		Attrezzo a = new Attrezzo("osso", 1);
		
		borsa.addAttrezzo(a);
		Attrezzo rimosso = borsa.removeAttrezzo("osso");
		
		assertEquals(a, rimosso);
		assertFalse(borsa.hasAttrezzo("osso"));
	}
	@Test
	void pesoTotaleTest() {
		Borsa borsa = new Borsa();
		Attrezzo a1 = new Attrezzo("lanterna", 3);
		Attrezzo a2 = new Attrezzo("osso", 1);
		
		borsa.addAttrezzo(a1);
		borsa.addAttrezzo(a2);
		
		assertEquals(4, borsa.getPeso());
	}
}
