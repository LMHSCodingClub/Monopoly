package com.lmhscodingclub.monopoly.boardlogic;
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
 
        Board gameboard = Board(); // creates the game board array and assigns every space a board space type. 
        
        //Create player array list
        ArrayList<Player> player_array = new Player[num_players];
 
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
    BoardSpace[] GameBoard = new BoardSpace[40]; 
    
    GameBoard[0] = new BoardSpace("Go", "Go", "Misc.");

    GameBoard[1] = new BoardSpace(60, "Mediterranean Avenue", "Brown");
    GameBoard[2] = new BoardSpace("Bonus", "Community Chest", "Misc.");
    GameBoard[3] = new BoardSpace(60, "Baltic Avenue", "Brown");
    GameBoard[4] = new BoardSpace("Tax", "Income Tax", "Misc.");
    GameBoard[5] = new BoardSpace("Railroad", "Reading Railroad", "Misc.");
    GameBoard[6] = new BoardSpace(100, "Oriental Avenue", "Light Blue");
    GameBoard[7] = new BoardSpace("Bonus", "Chance", "Misc.");
    GameBoard[8] = new BoardSpace(100, "Vermont Avenue", "Light Blue");
    GameBoard[9] = new BoardSpace(120, "Connecticut Avenue", "Light Blue");

    GameBoard[10] = new BoardSpace("Just Visiting", "Just Visiting", "Misc.");
    GameBoard[40] = new BoardSpace("Jail", "Jail", "Misc.");
    
    GameBoard[11] = new BoardSpace(140, "St. Charles Place", "Pink");
    GameBoard[12] = new BoardSpace("Utilities", "Electric Company", "Misc.");
    GameBoard[13] = new BoardSpace(140, "States Avenue", "Pink");
    GameBoard[14] = new BoardSpace(160, "Virginia Avenue", "Pink");
    GameBoard[15] = new BoardSpace("Railroad", "Pennsylvania Railroad", "Misc.");
    GameBoard[16] = new BoardSpace(180, "St. James Place", "Orange");
    GameBoard[17] = new BoardSpace("Bonus", "Community Chest", "Misc.");
    GameBoard[18] = new BoardSpace(180, "Tennessee Avenue", "Orange");
    GameBoard[19] = new BoardSpace(200, "New York Avenue", "Orange");

    GameBoard[20] = new BoardSpace("Free Parking", "Free Parking", "Misc.");
    
    GameBoard[21] = new BoardSpace(220, "Kentucky Avenue", "Red");
    GameBoard[22] = new BoardSpace("Bonus", "Chance", "Misc.");
    GameBoard[23] = new BoardSpace(220, "Indiana Avenue","Red");
    GameBoard[24] = new BoardSpace(240, "Illinois Avenue","Red");
    GameBoard[25] = new BoardSpace("Railroad", "B&O Railroad", "Misc.");
    GameBoard[26] = new BoardSpace(260, "Atlantic Avenue", "Yellow");
    GameBoard[27] = new BoardSpace(260, "Ventnor Avenue", "Yellow");
    GameBoard[28] = new BoardSpace("Utilities","Water Works", "Misc.");
    GameBoard[29] = new BoardSpace(280, "Marvin Gardens", "Yellow");
    
    GameBoard[30] = new BoardSpace("Go To Jail", "Go To Jail", "Misc.");

    GameBoard[31] = new BoardSpace(300, "Pacific Avenue", "Green");
    GameBoard[32] = new BoardSpace(300, "North Carolina Avenue", "Green");
    GameBoard[33] = new BoardSpace("Bonus", "Community Chest", "Misc.");
    GameBoard[34] = new BoardSpace(320, "Pennsylvania Avenue","Green");
    GameBoard[35] = new BoardSpace("Railroad", "Short Line", "Misc.");
    GameBoard[36] = new BoardSpace("Bonus", "Chance", "Misc");
    GameBoard[37] = new BoardSpace(350, "Park Place", "Blue");
    GameBoard[38] = new BoardSpace("Tax", "Luxury Tax", "Misc.");
    GameBoard[39] = new BoardSpace(400, "Boardwalk", "Blue");


    // we want it to be.
    // Return to here.
   }

   

 
}
