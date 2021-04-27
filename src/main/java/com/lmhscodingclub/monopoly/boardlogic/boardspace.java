package com.lmhscodingclub.monopoly.boardlogic;
class BoardSpace { //Maybe this should be abstract 
public static int FreeParking = 500;
private String type;
/*
List of all types:
Property
Railroad
Tax
Free Parking
Bonus(Community Chest and Chance)
Visiting Jail
Jail
Go To Jail
Go
Utilities
*/
private int price;
private String name;
private String color; //Maybe give all non-property squares some stupid inaccessible color
/*
List of all colors:
Red
Yellow
Green
Dark Blue
Brown
Light Blue
Pink
Orange
Misc. (Not for sale)
*/
private Player owner;

private int purchaseCost;
private int rent;

public BoardSpace()
{
    type = null;
    name = null;
    color = null;
}

public BoardSpace(String InputType, String InputName, String InputColor)
{
    type = InputType;
    name = InputName;
    color = InputColor;
}

public BoardSpace(int price, String InputName, String InputColor)
{
    type = "property";
    name = InputName;
    color = InputColor;
    purchaseCost = price;    
}

public void setRent(int set)
{
    rent = set;
}

//Write the action class (DoAction)/begin setting the board elements.
public void DoAction(Player player)
{
    switch(type)
    {
        b
        case "Property":
            if (owner == null && player.getBalance > cost) //getBalance may not be the final name
            {
                //offer to buy
            }
            else if(owner == player)
            {
                //do nothing
            }
            else if //Owner is not the player on the property
            {
                //charge them whatever is worth
            }
        break;


        case "Railroad":
            //charge the player
            //move the player to the correct square    if (owner == null)
            {
                //offer to buy
            }
            else if(owner == player)
            //Charge the player the amount stated
            //Add the amount charged to FreeParking    {
                //do nothing
            }
            else if //Owner is not the player on the property
            {
            //Add FreeParking dollars to the player
            FreeParking = 500;        //charge them whatever is worth
            }
        break;

        case "Tax": 

        
        break;

        
       case "Free Parking":
        

        break;

        
        case "Bonus":
        

        break;

        
        case "Visiting Jail":
            //Do Nothing
        break;

        
        case "Jail":
            //jail counter for each player? 
            //We can increemnt it by one, and when it hits 3 we set it
            // to 0 and move them to Visiting Jail
            //Or they can pay 50 to do that prematurely
        break;

        
            case "Go To Jail":
            //player.moveToJail();
        break;

        
        case "Go":
            //Give player 200$
        break;

        
        case "Utilities":
        
        break;

        
    }
}

}
