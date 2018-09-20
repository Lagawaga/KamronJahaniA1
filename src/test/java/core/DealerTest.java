package core;

import junit.framework.TestCase;

public class DealerTest extends TestCase{
	
	public void testStand(){
		Deck deck = new Deck();
		Dealer dealer = new Dealer(new Deck());
		deck.newDeck();
		dealer.hit(deck);
		int x = dealer.deckTotal();
		dealer.stand();
		assertEquals(x, dealer.deckTotal());
		
	}
	
	public void testHit() {
		Dealer dealer = new Dealer(new Deck());
		Deck deck = new Deck();
		deck.newDeck();
		int x = dealer.deckTotal();
		dealer.hit(deck);
		assertTrue(x < dealer.deckTotal());
	}
	
	public void testHitRepeat() {
		Dealer dealer = new Dealer(new Deck());
		Deck deck = new Deck();
		deck.newDeck();
		int x = dealer.deckTotal();
		dealer.hit(deck);
		dealer.hit(deck);
		dealer.hit(deck);
		int y = dealer.deckTotal();
		assertTrue(x < y);
	}
	
	public void testInitialBlackJack() {
		Dealer dealer = new Dealer(new Deck());
		dealer.add(new Card(1,1));
		dealer.add(new Card(11,2));
		assertEquals(true, dealer.initialBlackJack());
	}
	
	
	
	public void testDealerHit() {
		Dealer dealer = new Dealer(new Deck());
		Deck deck = new Deck();
		deck.addCard(new Card(1,3));
		deck.addCard(new Card(4,2));
		//System.out.println(deck.deckTotal());
		assertEquals(true, dealer.dealerHit());
		
	}
	
	/*public void testDealerStand() {
		Dealer dealer = new Dealer(new Deck());
		Deck deck = new Deck();
		deck.addCard(new Card(1,3));
		deck.addCard(new Card(6,2));
		assertEquals(true, dealer.dealerStand());
	}*/
	
	public void testDealerBust() {
		Dealer dealer = new Dealer(new Deck());
		Deck deck = new Deck();
		deck.addCard(new Card(1,3));
		deck.addCard(new Card(1,2));
		assertEquals(true, dealer.dealerBust());
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
