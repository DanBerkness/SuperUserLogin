package com.superuserlogin;

import java.util.Scanner;

public class GuiService {
	Scanner scanner = new Scanner(System.in);
	
	public void cleanUp() {
		System.out.println("Clean up!!!");
		scanner.close();
		System.exit(0);
	}
	
	public String askUser(String question) {
		System.out.println(question);
		return scanner.next();
	}
	public int userSelection(String question) {
		System.out.println(question);
		return scanner.nextInt();
	}
	
	
}
