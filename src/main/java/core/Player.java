package core;

public class Player {
	
	private Deck deck;

	public Player(Deck d) {
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
	
	public int stand() {
		return deck.deckTotal();
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
	
	
}
