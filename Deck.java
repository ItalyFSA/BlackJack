class Deck
{
	public Card[] deck;

	public Deck() {
		this.deck = new Card[52];
		for (int i = 1; i < 14; i++) {
			// must account for face cards only having value of 10
			int curValue = i;
			if (i >= 10)
				curValue = 10;
			if (i == 1)
				curValue = 11;
			// must account for face cards only having value of 10
			this.deck[i - 1] = new Card(curValue, Suit.Spades);
			this.deck[i + 12] = new Card(curValue, Suit.Diamonds);
			this.deck[i + 25] = new Card(curValue, Suit.Clubs);
			this.deck[i + 38] = new Card(curValue, Suit.Hearts);
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
		this.deck = new Card[52];
		for (int i = 1; i < 14; i++) {
			// must account for face cards only having value of 10
			int curValue = i;
			if (i >= 10)
				curValue = 10;
			if (i == 1)
				curValue = 11;
			// must account for face cards only having value of 10
			this.deck[i - 1] = new Card(curValue, Suit.Spades);
			this.deck[i + 12] = new Card(curValue, Suit.Diamonds);
			this.deck[i + 25] = new Card(curValue, Suit.Clubs);
			this.deck[i + 38] = new Card(curValue, Suit.Hearts);
		}
	}
}
