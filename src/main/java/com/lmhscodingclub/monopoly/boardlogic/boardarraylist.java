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
 
        BoardSpace[] gameboard = createBoard(); // creates the game board array and assigns every space a board space type. 
        
        //Create player array list
        ArrayList<Player> player_list = new ArrayList<Player>;
 
        for( int i = 0; i < num_player; i++)
        {
            player_list.add(Player("Player " + (i+1)/*whatever else*/));
            // Note that we will need to look up the initial deals and supply the proper amount of cash
            // Place the “first” player at location 0
        }
        // Player array list created
 
       // Game Loop Starts
       while(player_list.size() > 1)
       {
        
       if (turn < player_list.size-1)
          turn++;
       else
          turn = 0;
       }      
 
   }
