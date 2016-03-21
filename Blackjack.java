class Blackjack
{
	public static void main(String[] args)
	{
		try
		{
			runTests();
		}
		catch (Exception e)
		{
			System.out.println("Error: " + e.getMessage());
		}
	}

	public static void runTests()
	{
		DeckTests tests = new DeckTests();

		// shuffle the deck
		tests.testShuffle();

		// deal a card
		tests.testDealCard();

		// reset the deck
		tests.testReset();
	}

}
