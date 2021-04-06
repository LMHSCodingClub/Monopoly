import java.util.Scanner;
import java.util.ArrayList;
public class Board
{
    public static void Main(String[] args)
   {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many players are playing?");
        int num_player = scan.nextInt();
        int turn = 0;
 
        BoardS gameboard = Board(); // creates the game board array and assigns every space a board space type. 
        
        //Create player array list
        ArrayList<Player> player_array = new Player[num_players];;
 
        for( int i = 0; i < num_player; i++)
        {
            player_array[i] = Player("Player " + (i+1)/*whatever else*/);
            // Note that we will need to look up the initial deals and supply the proper amount of cash
            // Place the “first” player at location 0
        }
        // Player array list created
         
       // Game Loop Starts
       int doubles = 0;
       while(num_player > 1)
       {
        // Call dice rolling graphic
        int roll1 =  (int)(Math.random() * (6 - 1 + 1) + 1);
        int roll2 = (int)(Math.random() * (6 - 1 + 1) + 1);
        player_array[turn].move(roll1+roll2);
    
    player_array[turn].gameboard[player_array[turn].getLocation].doAction;
         
       if(roll1 == roll2){ 
         if (doubles == 2)
          {
             player[turn].moveToJail();
          }
          else
          {
          doubles++;
          turn--;
          }
        }
      
      // Call the interface and ask if the player wants to trade and all that. This section isn’t our business to code. 
 
        if (turn < num_player - 1) 
          turn++;
        else
          turn = 0;
       }      
 
   }

   public Board()
   {
    BoardSpace[] theGameBoard = new BoardSpace[40]; 
    

    // BoardSpace is abstract.
    // Call mutators that turn each board space into whatever space
    // we want it to be.
    // Return to here.
   }

   

 
}
