package core;

import java.util.Scanner;

public class BlackJack {

	public static void main(String[] args) {
		//Game game = new Game();
		//GameFile gamefile = new GameFile();
		String fileName = "temp.txt";
		
		System.out.println("Would you like to (F)ile or (C)onsole");
		Scanner scanner = new Scanner(System.in);
		String nextMove = scanner.nextLine();
		
		if(nextMove.equals("F") || nextMove.equals("f")) {
			GameFile gameFile = new GameFile();
			
		}
		
		if(nextMove.equals("C") || nextMove.equals("c")) {
			Game game = new Game();
			//game.Deal();
			game.playRound();
		}
		
		
	}
	
}
