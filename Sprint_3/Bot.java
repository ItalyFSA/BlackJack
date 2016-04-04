import java.io.*;

class Bot
{
	public static void main(String [] args)
	{
		Deck deck = new Deck();
		Player player = new Player();
		Dealer dealer = new Dealer();

		String[][] blackjackGame = new String[][]{
									{"hit", "stand"}, 
									{"hit", "hit", "stand"}, 
									{"stand"},
									{"hit", "hit", "hit", "stand"}, 
									{"hit", "stand"}, 
									{"stand"}, 
									{"hit", "hit", "stand"}, 
									{"stand"}, 
									{"hit", "stand"}, 
									{"hit", "stand"}
								};

		for (int i = 0; i < blackjackGame.length; ++i)
		{
			Blackjack.runBotGame(player, dealer, deck, blackjackGame[i]);
		}
	}
}
