package cardgame;

import java.io.PrintStream;

public class Deck {
  public static final int NUMOFCARDS = 52;
  private Card[] deck;
  
  public Deck() {
    deck = new Card[52];
    for (int i = 0; i < 52; i++) {
      deck[i] = new Card(i);
    }
  }
  
  public void writeDeck() {
    for (Card card : deck) {
      System.out.println(card.getSuit() + card.getRank() + " :" + card.getSequence());
    }
    System.out.println();
  }
  
  private void swap(Card[] arr, int i, int j) {
    Card temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
  
  public void shuffle()
  {
    for (int i = 51; i > 0; i--) {
      int index = (int)(Math.random() * (i + 1));
      swap(deck, i, index);
    }
  }
  
  public Card deal() {
    int index = (int)(Math.random() * 52.0D);
    return deck[index];
  }
}
