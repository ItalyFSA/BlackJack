import java.util.*;

class SystemTest
{
	public static void main(String[] args) 
	{
		// move to main code and then compile all and run this instead of running blackjack
		Deck deck = new Deck();
		Player p = new Player();
		Dealer d = new Dealer();

		deck.shuffle();
		deck.printDeck();
	}
}