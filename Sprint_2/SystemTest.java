import java.util.*;

class SystemTest
{
	public static void main(String[] args)
	{
		Deck deck = new Deck();
		Player p = new Player();
		Dealer d = new Dealer();

		deck.shuffle();
		

		//Play a Game of Blackjack 
		p.addCard(deck.dealCard());
		d.addCard(deck.dealCard());
		p.addCard(deck.dealCard());
		d.addCard(deck.dealCard());

		p.busted();
		p.blackjack();

		d.busted();
		d.blackjack();
		d.showHand();

		//Player or Dealer will hit here if they want to
		//Stand when they want.
		//After each hit, busted() or blackjack() will run

		p.showHand();

		p.clearHand();
		d.clearHand();

		//Once a victor is crowned, players and dealers hand will clear and they will be dealt a new one
		//deck is not shuffeled again till all of the deck is used up.

	}
}