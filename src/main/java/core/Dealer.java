package core;

public class Dealer {
	
	private Deck deck;
	//boolean stand;
	
	public Dealer(Deck d) {
		deck = d;
	}
	
	public int deckTotal() {
		int total=0;
		for (int i=0; i<deck.numCards(); i++) {
			total += deck.getCard(i).getValue();
		}
		return total;
	}
	
	public void hit(Deck incomingDeck) {
		deck.drawCard(incomingDeck);
	}
	
	public boolean stand() {
		return true;
	}
	
	public boolean initialBlackJack() {
		if(deck.deckTotal() == 21) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public void add(Card card) {
		deck.addCard(card);
	}
	

	

	
	public boolean dealerBust() {
		if(deck.deckTotal() >= 22) {
			return false;
		}else {
			return true;
		}
	}
	
	/*public boolean dealerStand() {
		if(deck.deckTotal() >= 17) {
			return true;
		}else {
			return false;
		}
	}*/
		
	public boolean dealerHit() {
		if(deck.deckTotal() <= 16) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
	
	
	
	
	
}
