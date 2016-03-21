class Card
{
	public int value;
	public Suit suit;

	public Card(int v, Suit s)
	{
		this.value = v;
		this.suit = s;
	}

	public String toString()
	{
		return this.value + " of " + this.suit;
	}
}
