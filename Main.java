/*Your task:

    Create a basketball player

         -ask the user for the name of the player and his team

    Add at least 6 games for the player
    Print out the player’s name, their statistics, and then print the object
*/
import java.util.Scanner;

class Main 
{
	public static void main(String[] args) 
	{

      //attributes 
      String name;
      String team;
    
      int points;
      int assists;

      //allow access to read user's input
      Scanner console = new Scanner(System.in);

    	//ask user for the name and team of first player
    	System.out.println("Enter the player's name: ");
      name = console.nextLine();
      System.out.println("Enter the player's team name: ");
      team = console.nextLine();
    	
    	//create BasketballPlayer object using name and team
    	BasketballPlayer player1 = new BasketballPlayer(name, team);
    	
    	//add all 6 NBA Final games
      System.out.println("Game1-Enter the points: ");
      points = console.nextInt();
      System.out.println("Game1- Enter the assists: ");
      assists = console.nextInt();
      System.out.println("Game2-Enter the points: ");
      points = console.nextInt();
      System.out.println("Game2- Enter the assists: ");
      assists = console.nextInt();
      System.out.println("Game3-Enter the points: ");
      points = console.nextInt();
      System.out.println("Game3- Enter the assists: ");
      assists = console.nextInt();
      System.out.println("Game4-Enter the points: ");
      points = console.nextInt();
      System.out.println("Game4- Enter the assists: ");
      assists = console.nextInt();
      System.out.println("Game5-Enter the points: ");
      points = console.nextInt();
      System.out.println("Game5- Enter the assists: ");
      assists = console.nextInt();
      System.out.println("Game6-Enter the points: ");
      points = console.nextInt();
      System.out.println("Game6- Enter the assists: ");
      assists = console.nextInt();
      
      //methods being used 
      player1.addGame(points,assists);
      // player1.printPPG();

    	
    	//Print name, Stats, and object.
      System.out.println(name + " Stats: ");
      player1.printPPG(); //this method doesn't need println statement because it has already been defined for its values to be printed out

      player1.printAPG(); //Same for this method, it  doesn't need println statement because it has already been defined for its values to be printed out
      player1.toString();

      console.close();
	}
}

/*
Sample Output - Actual Stats should be different:

Enter Player's Name and Team:

 Lebron James

 Lakers


Lebron James Stats:

Points per game: 26.0

Assists per game: 10.0

Lebron James averages 26.0 points per game.


Lebron Stats: https://www.espn.com/nba/player/_/id/1966/lebron-james

*/