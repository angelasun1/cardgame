package cardgame;

import java.util.Scanner;

public class DeckMain 
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		char c;
		do {
			int number;
			do {
				// Prompt player for a selection to begin program
				System.out.println("Welcome Player! Select an option from below to begin: ");
				System.out.println("1: show deck");
				System.out.println("2: shuffle deck");
				System.out.println("3: compare two random cards");
				System.out.println();
				number = reader.nextInt();
				System.out.println();
			}
			while (number < 1 || number > 3);
			
			// Program executes based on user input
			Deck d = new Deck();
			if(number == 1) {
				d.writeDeck();
			}
			if(number == 2) {
				d.shuffle();
				d.writeDeck();
			}
			if(number == 3) {
				System.out.println("Dealing Cards:");
				Card card1 = d.deal();
				Card card2 = d.deal();
				System.out.println(card1.getSuit()+ card1.getRank());
				System.out.println(card2.getSuit()+ card2.getRank());
				if(card1.compareTo(card2) > 0) {
					System.out.print(card1.getSuit()+ card1.getRank());
					System.out.print(" is greater than ");
					System.out.println(card2.getSuit()+ card2.getRank());
					System.out.println();
				}
				else {
					System.out.print(card1.getSuit()+ card1.getRank());
					System.out.print(" is smaller than ");
					System.out.println(card2.getSuit()+ card2.getRank());
					System.out.println();
				}
			 }
			System.out.println("Would you like to start again? (Y/N) ");
			System.out.println();
			c = reader.next().charAt(0);
			System.out.println();
		}
		while (c == 'y' | c == 'Y');
	}
}