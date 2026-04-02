package base;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StanzaTest {
	@Test
	void hasAttrezzoTest() {
		Stanza stanza = new Stanza("Aula");
		Attrezzo attrezzo = new Attrezzo("palle", 2);
		
		stanza.addAttrezzo(attrezzo);
		assertTrue(stanza.hasAttrezzo("palle"));
	}
	@Test
	void hasAttrezzoAssenteTest() {
		Stanza stanza = new Stanza("Aula");
		
		assertFalse(stanza.hasAttrezzo("palle"));
	}
	@Test
	void hasAttrezzoConOggettiTest() {
		Stanza stanza = new Stanza("Aula");
		
		Attrezzo a1 = new Attrezzo("palle", 2);
		Attrezzo a2 = new Attrezzo("chiave", 1);
		
		stanza.addAttrezzo(a1);
		stanza.addAttrezzo(a2);
		
		assertTrue(stanza.hasAttrezzo("chiave"));
	}
	@Test
	void getAttrezzoTest() {
		Stanza stanza = new Stanza("Aula");
		
		Attrezzo attrezzo = new Attrezzo("palle", 2);
		stanza.addAttrezzo(attrezzo);
		
		assertEquals(attrezzo, stanza.getAttrezzo("palle"));
	}
	@Test
	void getAttrezzoAssenteTest() {
		Stanza stanza = new Stanza("Aula");
		
		assertNull(stanza.getAttrezzo("palle"));
	}
	@Test
	void getAttrezziConPiuOggettiTest() {
		Stanza stanza = new Stanza("Aula");
		
		Attrezzo a1 = new Attrezzo("palle", 2);
		Attrezzo a2 = new Attrezzo("chiave", 1);
		
		stanza.addAttrezzo(a1);
		stanza.addAttrezzo(a2);
		
		assertEquals(a2, stanza.getAttrezzo("chiave"));
	}
	
	@Test
	void addAttrezzo() {
		Stanza stanza = new Stanza("Aula");
		
		Attrezzo attrezzo = new Attrezzo("palle", 2);
		
		assertTrue(stanza.addAttrezzo(attrezzo));
	}
	@Test
	void addAttrezzoStanzaPiena() {
		Stanza stanza = new Stanza("Aula");
		
		for(int i=0; i<10; i++) {
			stanza.addAttrezzo(new Attrezzo("a" + i, 1));
		}
		Attrezzo extra = new Attrezzo("extra", 1);
		
		assertFalse(stanza.addAttrezzo(extra));
	}
	@Test
	void addAttrezzoMultiploTest() {
		Stanza stanza = new Stanza("Aula");
		
		Attrezzo a1 = new Attrezzo("palle", 2);
		Attrezzo a2 = new Attrezzo("chiave", 1);
		
		stanza.addAttrezzo(a1);
		stanza.addAttrezzo(a2);
		
		assertTrue(stanza.hasAttrezzo("chiave"));
	}
}

