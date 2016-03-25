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
		System.out.println("\nDealt Card: " + curCard.toString());

		if (curCard != null)
		{
			System.out.println("No error dealing card.\n");
		}
		else
		{
			System.out.println("Error: dealing card failed!\n");
		}
	}

	public void testShuffle()
	{
		// test the shuffle
		System.out.println("\nShuffling Deck: \n");
		curDeck.shuffle();
		curDeck.printDeck();
		System.out.println("No error shuffling.\n");
	}

	public void testReset()
	{
		// test the reset
		System.out.println("\nReset Deck: \n");
		curDeck.reset();
		curDeck.printDeck();
		System.out.println("No error resetting.\n");
	}
}
