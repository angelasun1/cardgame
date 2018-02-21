package cardgame;

public class Deck {
	
	public static final int NUMOFCARDS = 52;
	
	private Card[] deck;
	
	public Deck() {
		deck = new Card[NUMOFCARDS];
		for(int i=0; i<NUMOFCARDS;i++) {
			deck[i]=new Card(i);
		}
	}
	
	public void writeDeck() {
		for(Card card:deck) {
			System.out.println(card.getSuit()+card.getRank() +" :"+card.getSequence());
		}
		System.out.println();
	}
	
	private void swap(Card[] arr, int i, int j) {
		Card temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public void shuffle() {
		int index;
		for(int i = NUMOFCARDS-1; i > 0; i--) {
			index = (int) (Math.random()*(i+1));  
			swap(this.deck, i, index);
		}
	}
	
	public Card deal() {
		int index = (int)(Math.random()*NUMOFCARDS);
		return deck[index];
	}
}
