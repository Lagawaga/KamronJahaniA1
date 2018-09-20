package core;

import junit.framework.TestCase;

public class CardTest extends TestCase{
	
	public void testFaceCard() {
		Card jack = new Card(11, 4);
		Card queen = new Card(12, 2);
		Card king = new Card(13, 3);
		
		assertEquals(10, jack.getValue());
		assertEquals(10, queen.getValue());
		assertEquals(10, king.getValue());
		
	}
	
	public void testIsAceHigh() {
		Card ace = new Card(1, 2);
		assertEquals(11, ace.getValue());
	}
	

	
	public void testNumberCard() {
		Card seven = new Card(7, 4);
		
		
		assertEquals(7, seven.getValue());
		assertEquals(7, seven.getValue());
		
	}
	
	public void testToStringFaceCard() {
		Card jack = new Card(11, 4);
		Card queen = new Card(12, 2);
		Card king = new Card(13, 3);
		
		assertEquals("SJ", jack.toString());
		assertEquals("HQ", queen.toString());
		assertEquals("CK", king.toString());
		
	}
	
	public void testToStringNumberCard() {
		Card seven = new Card(7, 2);
		
		assertEquals("H7", seven.toString());
	}
		
}
