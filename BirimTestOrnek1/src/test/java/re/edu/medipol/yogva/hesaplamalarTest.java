package re.edu.medipol.yogva;

import static org.junit.Assert.*;

import org.junit.Test;

public class hesaplamalarTest {

	@Test
	public void testFaktoriyel() {
		int sonuc = hesaplamalar.faktoriyel(5);
		assertEquals(120, sonuc);
	}

	@Test
	public void testFaktoriyelloop() {
		int sonuc = hesaplamalar.faktoriyelloop(5);
		assertEquals(120, sonuc);
	}
	
	@Test
	public void testTopla() {
		int sonuc = hesaplamalar.topla(3, 5);
		assertEquals(8, sonuc);
	}
	
	@Test
	public void testCikart() {
		int sonuc = hesaplamalar.cikart(10, 5);
		assertEquals(5, sonuc);
	}
	
	@Test
	public void testCarp() {
		int sonuc = hesaplamalar.carp(3, 5);
		assertEquals(15, sonuc);
	}

}
