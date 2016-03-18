import java.util.*;

class Deck
{
	public LinkedList<Card> deck;

	public Deck() {
		this.deck = new LinkedList<Card>();
		for (int i = 1; i < 14; i++) {
			// must account for face cards only having value of 10
			int curValue = i;
			if (i >= 10)
				curValue = 10;
			if (i == 1)
				curValue = 11;
			// must account for face cards only having value of 10
			this.deck.addFirst(new Card(curValue, Suit.Spades));
			this.deck.addFirst(new Card(curValue, Suit.Diamonds));
			this.deck.addFirst(new Card(curValue, Suit.Clubs));
			this.deck.addFirst(new Card(curValue, Suit.Hearts));
		}
	}

	public void printDeck()
	{
		// iterate through deck to see all the cards
		for (int i = 0; i < this.deck.size(); ++i) {
			System.out.println(this.deck.get(i).toString());
		}
	}

	public Card dealCard()
	{
		return this.deck.getFirst();
	}

	public void shuffle()
	{

	}

	public void reset()
	{
		this.deck = new LinkedList<Card>();
		for (int i = 1; i < 14; i++) {
			// must account for face cards only having value of 10
			int curValue = i;
			if (i >= 10)
				curValue = 10;
			if (i == 1)
				curValue = 11;
			// must account for face cards only having value of 10
			this.deck.addFirst(new Card(curValue, Suit.Spades));
			this.deck.addFirst(new Card(curValue, Suit.Diamonds));
			this.deck.addFirst(new Card(curValue, Suit.Clubs));
			this.deck.addFirst(new Card(curValue, Suit.Hearts));
		}
	}
}
