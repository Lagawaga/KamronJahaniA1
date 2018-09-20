package core;

import junit.framework.TestCase;

public class PlayerTest extends TestCase{
	
	public void testStand(){
		Deck playingDeck = new Deck();
		Player player = new Player(new Deck());
		player.drawCard(playingDeck);
		int x = player.getValue();
		player.stand();
		assertEquals(x, player.getValue);
		
	}
	
	public void testHit() {
		Player player = new Player(new Deck());
		Deck playingDeck = new Deck();
		int x = player.getValue();
		player.hit(playingDeck);
		assertTrue(x < player.getValue());
	}
	
	public void testHitRepeat() {
		Player player = new Player(new Deck());
		Deck playingDeck = new Deck();
		int x = player.getValue();
		player.hit(playingDeck);
		player.hit(playingDeck);
		player.hit(playingDeck);
		int y = player.getValue();
		assertTrue(x < y);
	}
	
	public void testInitialBlackJack() {
		Player player = new Player(new Deck());
		player.add(new Card(1,1));
		player.add(new Card(1,10));
		assertEquals(true, initialBlackJack());
	}
	
	
}
