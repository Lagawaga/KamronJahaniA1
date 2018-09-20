package core;

import java.util.ArrayList;
import java.util.Random;


public class Deck {
	
private ArrayList<Card> deck;
	
	public Deck(){
		this.deck = new ArrayList<Card>();
	}
	
	public void newDeck() {
		
		for(int i=1;i<5;++i) {
			for(int j=1;j<14;++j) {
				this.deck.add(new Card(j, i));
			}
		}
	}
	
	public int numCards() {
		return this.deck.size();
	}
	
	public void shuffle() {
		ArrayList<Card> tmp = new ArrayList<Card>();
		Random rand = new Random();
		int index = 0;
		int size = this.deck.size();
		for(int i=0; i < size; i++) {
			index = rand.nextInt((this.deck.size()-1)+1);
			tmp.add(this.deck.get(index));
			this.deck.remove(index);
		}
		
		this.deck = tmp;
	}
	
	public String toString() {
		
		String output = ""; 
		
		for(Card card : this.deck) {
			output +=  card.toString();
		}
		return output;
	}
	
	public Card getCard(int index) {
		return this.deck.get(index);
	}

	public void remove(int index) {
		this.deck.remove(index);
	}
	
	public void addCard(Card card) {
		this.deck.add(card);
	}
	
	public void drawCard(Deck incomingDeck) {
		this.deck.add(incomingDeck.getCard(0));
		incomingDeck.remove(0);
	}
	
	public int deckTotal() {
		
		int total = 0;
		
		for(Card card : this.deck) {
			total += card.getValue();
		}
		
		return total;
		
	}

}
