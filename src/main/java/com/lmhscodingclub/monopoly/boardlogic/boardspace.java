class BoardSpace { //Maybe this should be abstract 
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

public BoardSpace()
{
    type = null;
    name = null;
    color = null;
}

public SetSpace(String InputType, String InputName, String InputColor)
{
    type = InputType;
    name = InputName;
    color = InputColor;
}

public SetSpace(int price, String InputName, String InputColor)
{
    type = "property";
    name = InputName;
    color = InputColor;
    int purchaseCost = price;    
}

//Write the action class (DoAction)/begin setting the board elements.


}
