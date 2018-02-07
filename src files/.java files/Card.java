package cardgame;

public class Card
{
  public final String[] SUITS = { "♠", "♥", "♦", "♣" };
  public final String[] RANKS = { "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2" };
  public final int numRanks = 13;
  private String suit;
  private String rank;
  private int sequence;
  
  public Card(int seq)
  {
    sequence = seq;
    suit = SUITS[(seq / 13)];
    rank = RANKS[(seq % 13)];
  }
  
  public int getSequence() {
    return sequence;
  }
  
  public void setSequence(int sequence) { this.sequence = sequence; }
  
  public String getSuit() {
    return suit;
  }
  
  public void setSuit(String suit) { this.suit = suit; }
  
  public String getRank() {
    return rank;
  }
  
  public void setRank(String rank) { this.rank = rank; }
  








  public int compareTo(Card card)
  {
    if (sequence % 13 < card.getSequence() % 13)
      return 1;
    if (sequence % 13 == card.getSequence() % 13) {
      return sequence / 13 < card.getSequence() / 13 ? 1 : -1;
    }
    return -1;
  }
}
