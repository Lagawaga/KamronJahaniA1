package core;

import junit.framework.TestCase;

public class GameTest extends TestCase{
	
	public void testDeal() {
		Player player = new Player(new Deck());
		Dealer dealer = new Dealer(new Deck());
		Deck playingDeck = new Deck();
		playingDeck.newDeck();
		playingDeck.shuffle();
		player.hit(playingDeck);
		player.hit(playingDeck);
		dealer.hit(playingDeck);
		dealer.hit(playingDeck);
		assertTrue(player.deckTotal() != 0);
		assertTrue(dealer.deckTotal() != 0);
	}
	
	

}
