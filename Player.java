import java.util.*;

class Player
{
	public ArrayList<Card> hand;
	public int score;
	public int aceCount;

	public Player() 
	{
		hand = new ArrayList<Card>();
		score = 0;
		aceCount = 0;
	}

	public void addCard(Card card)
	{
		System.out.println(card.toString());

		// adding card to dealer hand
		this.hand.add(card);
		if (card.value == 1)
			this.score += 11;
		else if (card.value >= 10)
			this.score += 10;
		else
			this.score += card.value;

		// update ace count for handling later
		if (card.value == 1) 
			this.aceCount++;

		this.handleAce();
	}

	private void handleAce()
	{
		if (this.aceCount == 0) return;
		if (this.score > 21)
		{
			// handle ace case if there is an ace
			for (int i = 0; i < this.hand.size(); ++i)
			{
				if (this.hand.get(i).value == 1)
				{
					// change the score to 1 instead of 11 
					//(add the current card value and subtract 10)
					this.score += - 10;
					this.aceCount--;
					if (this.score < 21 || this.aceCount == 0)
						break;
				}
			}
		}
	}

	public void clearHand()
	{
		hand = new ArrayList<Card>();
		score = 0;
		aceCount = 0;
	}

	public void showHand()
	{
		System.out.println("Player Hand: ");
		for (int i = 0; i < hand.size(); ++i)
		{
			System.out.println("\t" + this.hand.get(i).toString());
		}
		System.out.println("Score: " + this.score);
	}

	public boolean busted()
	{
		if (this.score > 21)
			return true;
		return false;
	}

	public boolean blackjack()
	{
		if (this.score == 21)
			return true;
		return false;
	}
}
