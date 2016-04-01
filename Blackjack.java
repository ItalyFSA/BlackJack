import java.io.*;

class Blackjack
{
	public static void main(String[] args)
	{
		try
		{
			// tests
			// runDeckTests();
			// runDealerTests();
			// runPlayerTests();

			Player player = new Player();
			Dealer dealer = new Dealer();

			Deck deck = new Deck();
		
			boolean running = true;
			while (running)
			{
				try	
				{
					System.out.println("New hand? yes or no (please type as written)");
					String input = (new BufferedReader(new InputStreamReader(System.in))).readLine();
					if (input.equals("yes"))
					{
						runGame(player, dealer, deck);
					}
					else if (input.equals("no"))
					{
						running = false;
						System.out.println("Bye.");
					}
					else
					{
						System.out.println("Didn't understand input please try again.");
					}
				}
				catch (Exception e)
				{
					System.out.println("Error with taking input. Abort.");
					running = false;
				}
			}
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
					if (input.equals("hit"))
					{
						boolean end = hit(player, dealer, deck);
						if (end)
							run = false;
					}
					else if (input.equals("stand"))
					{
						stand(player, dealer, deck);
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
		// clear the hands
		player.clearHand();
		dealer.clearHand();

		// reset the deck
		deck.reset();
		deck.shuffle();

		// add cards
		player.addCard(deck.dealCard());
		dealer.addCard(deck.dealCard());
		player.addCard(deck.dealCard());
		dealer.addCard(deck.dealCard());

		// show the hands
		player.showHand();
		dealer.showHand();
	}

	public static boolean hit(Player player, Dealer dealer, Deck deck)
	{
		player.addCard(deck.dealCard());
		player.showHand();

		if (player.busted())
		{
			whoWon(player, dealer);
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void stand(Player player, Dealer dealer, Deck deck)
	{
		System.out.println("You stand");
		playDealerHand(player, dealer, deck);
	}

	public static void playDealerHand(Player player, Dealer dealer, Deck deck)
	{
		System.out.println("Dealer playing hand... ");
		// if score is 17 or greater, stand
		boolean dealerHandRunning = true;
		while (dealerHandRunning)
		{
			if (dealer.score < 17)
			{
				System.out.println("Dealer adding card to hand... ");
				dealer.addCard(deck.dealCard());
			}
			else
			{
				dealerHandRunning = false;
				System.out.println("Dealer stands... ");
			}
		}
		whoWon(player, dealer);
	}

	public static void whoWon(Player player, Dealer dealer)
	{
		System.out.println("Who won?????");
		// show cards to user
		player.showHand();
		dealer.displayHand();

		if (player.busted())
		{
			System.out.println("Sorry you busted!! You lose. :(");
		}
		else
		{
			if (dealer.busted())
			{
				System.out.println("Dealer busted!! You win!! :)");
			}
			else
			{
				if (player.score < dealer.score)
				{
					System.out.println("Sorry!! You lose. :(");
				}
				else if (player.score > dealer.score)
				{
					System.out.println("You win!! :)");
				}
				else
				{
					System.out.println("Wow. Its a tie!! :/");
				}
			}
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
