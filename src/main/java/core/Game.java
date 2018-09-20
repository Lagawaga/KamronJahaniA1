package core;

import java.util.Scanner;



public class Game {

	public void Deal() {
		Player player = new Player(new Deck());
		Dealer dealer = new Dealer(new Deck());
		Deck playingDeck = new Deck();
		playingDeck.newDeck();
		playingDeck.shuffle();
		player.hit(playingDeck);
		player.hit(playingDeck);
		dealer.hit(playingDeck);
		dealer.hit(playingDeck);
	}
	
	public String Winner() {
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
	
	public void playRound() {
		while(true) {
			
			
			Deck playingDeck = new Deck();
			Deck pDeck = new Deck();
			Deck dDeck = new Deck();
			//boolean gameOver = false;
			

			
			dDeck.drawCard(playingDeck);
			dDeck.drawCard(playingDeck);
			
			pDeck.drawCard(playingDeck);
			pDeck.drawCard(playingDeck);
			
			while (true) {
				System.out.println("Player Hand: " + pDeck.toString());
				System.out.println("\n"+ "Dealer Hand: " + "\n" + dDeck.getCard(0).toString());
				System.out.println("\n"+ "Player Score: " + pDeck.deckTotal());
				System.out.println("Dealer Score: " + pDeck.getCard(0).getValue());
				System.out.println();
				System.out.println("Would you like to (H)it or (S)tand");
				Scanner scanner = new Scanner(System.in);
				String nextMove = scanner.nextLine();
				
				if(nextMove.equals("H") || nextMove.equals("h")) {
					pDeck.drawCard(playingDeck);
					//System.out.println("Player Hand: " + pDeck.toString());
					if(pDeck.deckTotal() > 21) {
						System.out.println("Player Busted");
						System.out.println("Player Hand: " + pDeck.toString());
						System.out.println("Player Score: " + pDeck.deckTotal());
						//gameOver = true;
						break;
					}
					
				}
				
				if(nextMove.equals("S") || nextMove.equals("s")) {
					break;
				}
			}
			
			System.out.println("Dealer Hand: " + dDeck.toString());
			System.out.println("Dealer Score: " + dDeck.deckTotal());
		}
	}
	
}
