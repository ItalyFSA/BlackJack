class Blackjack
{
	public static void main(String[] args)
	{
		try
		{
			Deck d = new Deck();
		}
		catch (Exception e)
		{
			System.out.println("Error: " + e.getMessage());
		}
	}
}

