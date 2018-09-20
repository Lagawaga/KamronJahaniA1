package core;

public class Card {
	
	private int value;
	private int suit;

	public Card(int i, int c) {
		this.value = i;
		this.suit = c;
	}

	public int getValue() {
		
		if(value == 1) {
			return 1;
		}
		
		if(value < 10) {
			return value;
		}else {
			return 10;
		}
		
	}
	
	public String toString() {
		
		if(value == 1) {
			if(suit == 1) {
				return "DA";
			}else if(suit == 2) {
				return "HA";
			}else if(suit == 3) {
				return "CA";
			}else {
				return "SA";
			}
		}else if(value == 11) {
			if(suit == 1) {
				return "DJ";
			}else if(suit == 2) {
				return "HJ";
			}else if(suit == 3) {
				return "CJ";
			}else {
				return "SJ";
			}
		}else if(value == 12) {
			if(suit == 1) {
				return "DQ";
			}else if(suit == 2) {
				return "HQ";
			}else if(suit == 3) {
				return "CQ";
			}else {
				return "SQ";
			}
		}else if(value == 13) {
			if(suit == 1) {
				return "DK";
			}else if(suit == 2) {
				return "HK";
			}else if(suit == 3){
				return "CK";
			}else {
				return "SK";
			}
		}else if(value > 1 && value <=10){
			if(suit == 1) {
				return ("D" + value);
			}else if(suit == 2) {
				return("H" + value);
			}else if(suit == 3) {
				return ("C" + value);
			}else {
				return ("S" + value);
			}
		}else {
			return "Error!";
		}
	}
	

}
