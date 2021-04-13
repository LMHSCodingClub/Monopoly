package com.lmhscodingclub.monopoly.playerdata;

public class Player {
    String name;
    BoardPiece piece;
    Ownership ownership;

    public Player(String name, BoardPiece piece) {
        this.name = name;
        this.piece = piece;
        ownership = new Ownership();
    }

    public String getName() {
        return name;
    }

    public BoardPiece getPiece() {
        return piece;
    }

    public Ownership getOwnership() { 
        return ownership;
    }
}
