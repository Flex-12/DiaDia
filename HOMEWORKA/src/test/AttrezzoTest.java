package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import base.Attrezzo;

class AttrezzoTest {

	@Test
	void test01() {
		Attrezzo myFuckingAttrezzo = new Attrezzo("Martello", 1);
		assertEquals("Martello", myFuckingAttrezzo.getNome());
		//assertEquals(1, myFuckingAttrezzo.getPeso());
		//fail("Not yet implemented");
	}
	
	@Test
	void test02() {
		Attrezzo myFuckingAttrezzo = new Attrezzo("Martello", 1);
		//assertEquals("Martello", myFuckingAttrezzo.getNome());
		assertEquals(1, myFuckingAttrezzo.getPeso());
		//fail("Not yet implemented");
	}

}
