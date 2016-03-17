class Deck
{
	public Card[] deck;

	public Deck() {
		this.deck = new Card[52];
		for (int i = 1; i < 14; i++) {
			// must account for face cards only having value of 10
			this.deck[i - 1] = new Card(i, Suit.Spades);
			this.deck[i + 12] = new Card(i, Suit.Diamonds);
			this.deck[i + 25] = new Card(i, Suit.Clubs);
			this.deck[i + 38] = new Card(i, Suit.Hearts);
		}
	}

	public void printDeck()
	{

	}

	public Card dealCard()
	{
		return null;
	}

	public void shuffle()
	{

	}

	public void reset()
	{

	}
}
