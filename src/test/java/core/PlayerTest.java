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
		assertEquals(true, player.initialBlackJack());
	}
	
	public void testDeckTotal() {
		Deck deck1 = new Deck();
		deck1.newDeck();
		deck1.shuffle();
		Deck deck2 = new Deck();
		deck2.addCard(deck1.getCard(0));
		deck2.addCard(deck1.getCard(1));
		
		assertEquals((deck2.getCard(0).getValue()+deck2.getCard(1).getValue()), deck2.deckTotal());
	}
	
	public void testPlayerBust() {
		Player player = new Player(new Deck());
		Deck deck = new Deck();
		deck.addCard(new Card(1,3));
		deck.addCard(new Card(1,2));
		assertEquals(true, player.playerBust());
	}
	
	
}
