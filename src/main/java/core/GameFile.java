package core;

import java.io.File;
import java.util.Scanner;

public class GameFile extends Game{
	
	public GameFile() {
		fileInput();
	}
	
	
	public void fileInput() {
		System.out.println("File Path:");
		Scanner fileLocationScanner = new Scanner(System.in);
		Scanner input = null;
		String fileLocation = "";
		String content = "";
		String[] output;
		
		if(fileLocationScanner.hasNext()) {
			fileLocation = fileLocationScanner.nextLine();
		}
		
		try {
			input = new Scanner(new File(fileLocation));
			
		}catch(Exception e) {
			System.out.println("e");
		}
		
		while(input.hasNext()) {
			content += input.next(",");
		}
		
		output = content.split(",");
		System.out.println(output);
		
		
	}

}
