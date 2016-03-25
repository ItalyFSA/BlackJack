class PlayerTests
{
	public Player curPlayer;

	public PlayerTests()
	{
		// create player
		curPlayer = new Player();
	}

	public void testAddCard()
	{
		// have a card and add it to the hand
		Card c = new Card(11, Suit.Diamonds);

		System.out.println("\nDealt Card: " + c.toString());
		curPlayer.addCard(c);

		// if hand has a length of 1 then it worked!
		if (curPlayer.hand.size() == 1)
		{
			System.out.println("No error adding card to dealers hand.\n");
		}
		else
		{
			System.out.println("Error: adding card to dealers hand failed!\n");
		}
	}

	public void testHandleAce()
	{
		// have a card and add it to the hand
		Card c = new Card(1, Suit.Spades);

		System.out.println("\nDealt Card to test Ace: " + c.toString());

		// when adding card the handleAce() function gets called
		curPlayer.addCard(c);

		System.out.println("Score: " + curPlayer.score);

		// if hand has a length of 1 then it worked!
		if (curPlayer.score <= 21)
		{
			System.out.println("No error handling aces in dealers hand.\n");
		}
		else
		{
			System.out.println("Error: handling aces in dealers hand failed!\n");
		}
	}

	public void testClearHand()
	{
		System.out.println("\nClearing Hand");

		// when adding card the handleAce() function gets called
		curPlayer.clearHand();

		System.out.println("Score: " + curPlayer.score);

		// if hand has a length of 1 then it worked!
		if (curPlayer.hand.size() == 0)
		{
			System.out.println("No error clearing the dealers hand.\n");
		}
		else
		{
			System.out.println("Error: clearing the dealers hand failed!\n");
		}
	}

	public void testBlackjack()
	{
		// have a card and add it to the hand
		Card c1 = new Card(1, Suit.Spades);
		Card c2 = new Card(10, Suit.Spades);

		System.out.println("\nDealt Card to test Blackjack: " + c1.toString());
		System.out.println("Dealt Card to test Blackjack: " + c2.toString());

		// setting up blackjack
		curPlayer.addCard(c1);
		curPlayer.addCard(c2);

		System.out.println("Score: " + curPlayer.score);

		// if hand has a length of 1 then it worked!
		if (curPlayer.blackjack())
		{
			System.out.println("No error calling blackjack in dealers hand.\n");
		}
		else
		{
			System.out.println("Error: calling blackjack in dealers hand failed!\n");
		}
		curPlayer.clearHand();
	}

	public void testBusted()
	{
		// have a card and add it to the hand
		Card c1 = new Card(3, Suit.Spades);
		Card c2 = new Card(10, Suit.Spades);
		Card c3 = new Card(10, Suit.Spades);

		System.out.println("\nDealt Card to test bust: " + c1.toString());
		System.out.println("Dealt Card to test bust: " + c2.toString());
		System.out.println("Dealt Card to test bust: " + c3.toString());

		// setting up bust
		curPlayer.addCard(c1);
		curPlayer.addCard(c2);
		curPlayer.addCard(c3);

		System.out.println("Score: " + curPlayer.score);

		// if hand has a length of 1 then it worked!
		if (curPlayer.busted())
		{
			System.out.println("No error calling bust in dealers hand.\n");
		}
		else
		{
			System.out.println("Error: calling bust in dealers hand failed!\n");
		}
		curPlayer.clearHand();
	}

	public void testShowHand()
	{
		// have a card and add it to the hand
		Card c1 = new Card(7, Suit.Clubs);
		Card c2 = new Card(1, Suit.Spades);

		System.out.println("\nDealt Card to test show hand: " + c1.toString());
		System.out.println("Dealt Card to test show hand: " + c2.toString());

		// setting up bust
		curPlayer.addCard(c1);
		curPlayer.addCard(c2);

		System.out.println("Score: " + curPlayer.score);

		curPlayer.showHand();

		System.out.println("No error showing dealers hand.\n");
		curPlayer.clearHand();
	}
}
