package cardgame;

import java.io.PrintStream;

public class DeckMain { public DeckMain() {}
  
  public static void main(String[] args) { Deck d = new Deck();
    d.writeDeck();
    d.shuffle();
    d.writeDeck();
    System.out.println("Dealing Cards:");
    Card card1 = d.deal();
    Card card2 = d.deal();
    System.out.println(card1.getSuit() + card1.getRank());
    System.out.println(card2.getSuit() + card2.getRank());
    if (card1.compareTo(card2) > 0) {
      System.out.print(card1.getSuit() + card1.getRank());
      System.out.print(" is greater than ");
      System.out.print(card2.getSuit() + card2.getRank());
      System.out.println();
    } else {
      System.out.print(card1.getSuit() + card1.getRank());
      System.out.print(" is smaller than ");
      System.out.print(card2.getSuit() + card2.getRank());
      System.out.println();
    }
  }
}
