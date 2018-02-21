package cardgame;

public class Card {
	// Public final String[] SUITS = {"Spade","Heart", "Diamond", "Club" };
	public final String[] SUITS = { "\u2660","\u2665", "\u2666", "\u2663"};
	public final String[] RANKS = { "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2" };
	public final int numRanks = 13;

	private String suit;
	private String rank;
	private int sequence;
	
	public Card(int seq) {
		this.sequence=seq;
		this.suit = SUITS[seq/numRanks];
		this.rank = RANKS[seq%numRanks];
	}
	
	public int getSequence() {
		return sequence;
	}
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	
	/*
	 * Compare two cards if they have same suit, then compare ranks
	 * Otherwise if compare ranks first then if they have same rank compare suit
	 * "Spade">"Heart">"Diamond">"Club" 
	 * "A"> "K"> "Q"> "J"> "10"> "9"> "8"> "7"> "6"> "5"> "4"> "3"> "2"
	 */
	public int compareTo(Card card) {
		
		if(this.sequence%numRanks < card.getSequence()%numRanks) {
			return 1;
		}else if(this.sequence%numRanks == card.getSequence()%numRanks) {
			return (this.sequence/numRanks < card.getSequence()/numRanks)? 1:-1;
		}else
			return -1;
		}
	}
	 

