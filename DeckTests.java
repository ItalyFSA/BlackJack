class DeckTests
{
	public Deck curDeck;

	public DeckTests()
	{
		// create deck
		curDeck = new Deck();
	}

	public void testDealCard()
	{
		// deal the card and test the size of the deck
		Card curCard = curDeck.dealCard();
		if (curCard != null && curDeck.deck.size() == 51)
		{
			System.out.println("No error dealing card.");
		}
		else
		{
			System.out.println("Error: dealing card failed!");
		}
	}

	public void testShuffle()
	{
		// test the shuffle
		curDeck.shuffle();
		curDeck.printDeck();
		System.out.println("No error shuffling.");
	}

	public void testReset()
	{
		// test the reset
		curDeck.reset();
		curDeck.printDeck();
		System.out.println("No error resetting.");
	}
}
