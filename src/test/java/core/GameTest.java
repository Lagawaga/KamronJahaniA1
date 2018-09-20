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
	
	public String testWinner() {
		Player player = new Player(new Deck());
		Dealer dealer = new Dealer(new Deck());
		if(!player.initialBlackJack() && !dealer.initialBlackJack()) {
			if(player.deckTotal() == dealer.deckTotal()) {
				return("Push!");
			}else if(player.playerBust()) {
				return("Dealer wins!");
			}else if(!player.playerBust() && dealer.dealerBust()) {
				return("Player wins!");
			}else if(player.deckTotal() > dealer.deckTotal()) {
				return("Player wins!");
			}else if(dealer.deckTotal() < player.deckTotal()) {
				return("Dealer wins!");
			}
		}else if(player.initialBlackJack() && !dealer.initialBlackJack()) {
			return("Player wins!");
		}else if(player.initialBlackJack() && dealer.initialBlackJack()) {
			return("Dealer wins!");
		}
		return("ERROR");
	}

}
