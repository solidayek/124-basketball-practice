public class BasketballPlayer 
{
    /* This class is complete. Take a look around
     * to make sure you understand how to use it,
     * but you do not need to make changes.
     */
    //attributes
	private String name;
	private String team;
	private int totalPoints;
    private int totalAssists;
	private int gamesPlayed;

	//constructors
    public BasketballPlayer(String playerName, String currentTeam) 
    {
		name = playerName;
        team = currentTeam;
		totalPoints = 0;
		gamesPlayed = 0;
	}

    public BasketballPlayer(String playerName) 
    {
    	name = playerName;
        team = "no team";
		totalPoints = 0;
		gamesPlayed = 0;
	}

	//methods
	public void addGame(int points, int assists) 
	{
		totalPoints += points;
        totalAssists += assists;
		gamesPlayed ++;
	}

	public void printPPG() 
	{
		System.out.print("Points per game: ");
        System.out.println((double) totalPoints / gamesPlayed);
	}

    public void printAPG() 
    {
		System.out.print("Assists per game: ");
        System.out.println((double) totalAssists / gamesPlayed);
	}

	public String toString() 
	{
		return name + " averages " + ((double) totalPoints / gamesPlayed) + " points per game.";
	}
}
