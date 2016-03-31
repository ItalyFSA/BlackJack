import java.io.*;

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

			Player player = new Player();
			Dealer dealer = new Dealer();

			Deck deck = new Deck();

			runGame(player, dealer, deck);
		}
		catch (Exception e)
		{
			System.out.println("Error: " + e.getMessage());
		}
	}

	public static void runGame(Player player, Dealer dealer, Deck deck)
	{
		newHand(player, dealer, deck);

		if (player.blackjack())
		{
			// player wins
			whoWon(player, dealer);
		}
		else if (dealer.blackjack())
		{
			// dealer wins
			whoWon(player, dealer);
		}
		else
		{
			boolean run = true;
			while (run)
			{
				try	
				{
					System.out.println("hit or stand? (please type as written)");
					String input = (new BufferedReader(new InputStreamReader(System.in))).readLine();
					if (input == "hit")
					{
						boolean end = hit(player, deck);
						if (end)
							run = false;
					}
					else if (input == "stand")
					{
						stand();
						run = false;
					}
					else
					{
						System.out.println("Didn't understand input please try again.");
					}
				}
				catch (Exception e)
				{
					System.out.println("Error with taking input. Abort.");
					run = false;
				}
				
			}
		}
	}

	public static void newHand(Player player, Dealer dealer, Deck deck)
	{
		
	}

	public void dealNewHand()
	{
		
	}

	public static boolean hit(Player player, Deck deck)
	{
		return false;
	}

	public static void stand()
	{
		
	}

	public void playDealerHand(Dealer dealer, Deck deck)
	{
		
	}

	public void static whoWon(Player player, Dealer dealer)
	{
		
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
