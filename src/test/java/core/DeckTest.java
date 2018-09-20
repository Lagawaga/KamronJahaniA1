package core;

import junit.framework.TestCase;


public class DeckTest extends TestCase{
	
	public void testNewDeck(){
		Deck deck = new Deck();
		deck.newDeck();
		assertEquals(52, deck.numCards());
	}
	
	public void testRemoveCard() {
		Deck deck = new Deck();
		deck.newDeck();
		deck.remove(1);
		
		assertEquals(51, deck.numCards());
	}
	
	public void testAddCard() {
		Deck deck = new Deck();
		deck.newDeck();
		deck.remove(1);
		deck.remove(2);
		deck.addCard(deck.getCard(0));
		assertEquals(51, deck.numCards());
	}
	
	public void testDrawCard() {
		Deck deck = new Deck();
		Deck playerDeck = new Deck();
		
		deck.newDeck();
		
		playerDeck.drawCard(deck);
		assertEquals(1, playerDeck.numCards());
		assertEquals(51, deck.numCards());
		
	}
	
	public void testHitRepeat() {
		Deck deck = new Deck();
		deck.newDeck();
		Deck playerDeck = new Deck();
		

		playerDeck.drawCard(deck);
		playerDeck.drawCard(deck);
		playerDeck.drawCard(deck);
		playerDeck.drawCard(deck);
		playerDeck.drawCard(deck);
		
		
		assertEquals(5,playerDeck.numCards());
		
		
	}
	
	public void testToString() {
		Deck playingDeck = new Deck();
		playingDeck.newDeck();
		Deck deck = new Deck();
		
		deck.addCard(playingDeck.getCard(0));
		assertEquals("DA", deck.toString());
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

}
