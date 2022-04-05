package com.comcast.statement;

class WelcomeMessage {
	void printMessage() {
		System.out.println("Welcome All");
	}
}

public class TestProgram {

	public static void main(String[] args) {
		
		WelcomeMessage welcomeMessage = new WelcomeMessage();
		
		int n = 5;
		
		while(n-- > 0) {
			welcomeMessage.printMessage();
		}
		
	}

}
