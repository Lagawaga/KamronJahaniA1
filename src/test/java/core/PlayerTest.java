package core;

import junit.framework.TestCase;

public class PlayerTest extends TestCase{
	
	public void testStand(){
		Deck playingDeck = new Deck();
		Player player = new Player(new Deck());
		playingDeck.newDeck();
		player.hit(playingDeck);
		int x = player.deckTotal();
		player.stand();
		assertEquals(x, player.deckTotal());
		
	}
	
	public void testHit() {
		Player player = new Player(new Deck());
		Deck playingDeck = new Deck();
		playingDeck.newDeck();
		int x = player.deckTotal();
		player.hit(playingDeck);
		assertTrue(x < player.deckTotal());
	}
	
	public void testHitRepeat() {
		Player player = new Player(new Deck());
		Deck playingDeck = new Deck();
		playingDeck.newDeck();
		int x = player.deckTotal();
		player.hit(playingDeck);
		player.hit(playingDeck);
		player.hit(playingDeck);
		int y = player.deckTotal();
		assertTrue(x < y);
	}
	
	public void testInitialBlackJack() {
		Player player = new Player(new Deck());
		player.add(new Card(1,1));
		player.add(new Card(11,2));
		System.out.println(player.toString());
		System.out.println(player.deckTotal());
		assertEquals(true, player.initialBlackJack());
	}
	
	public void testNewDeck(){
		Deck deck = new Deck();
		deck.newDeck();
		assertEquals(52, deck.numCards());
	}
	
	
}
