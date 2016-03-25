class Blackjack
{
	public static void main(String[] args)
	{
		try
		{
			// tests
			runDeckTests();
			runDealerTests();
			runPlayerTests();
		}
		catch (Exception e)
		{
			System.out.println("Error: " + e.getMessage());
		}
	}

	public static void runDeckTests()
	{
		System.out.println("\n\nDeck tests");
		DeckTests tests = new DeckTests();

		// shuffle the deck
		tests.testShuffle();

		// deal a card
		tests.testDealCard();

		// reset the deck
		tests.testReset();
	}

	public static void runDealerTests()
	{
		System.out.println("\n\nDealer tests");
		DealerTests tests = new DealerTests();

		// adding card to hand
		tests.testAddCard();

		// handling ace when over 21
		tests.testHandleAce();

		// clearing the hand
		tests.testClearHand();

		// blackjack in hand
		tests.testBlackjack();

		// hand busts
		tests.testBusted();

		// showing partial hand
		tests.testShowHand();

		// displaying all of hand
		tests.testDisplayHand();
	}

	public static void runPlayerTests()
	{
		System.out.println("\n\nPlayer tests");
		PlayerTests tests = new PlayerTests();

		// adding card to hand
		tests.testAddCard();

		// handling ace when over 21
		tests.testHandleAce();

		// clearing the hand
		tests.testClearHand();

		// blackjack in hand
		tests.testBlackjack();

		// hand busts
		tests.testBusted();

		// showing partial hand
		tests.testShowHand();
	}

}
