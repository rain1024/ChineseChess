package com.magizbox.chinesechess.engine;

import java.util.HashMap;

public class Piece {
    public enum COLOR { RED, GREEN}
    public enum NAME { GENERAL, ADVISOR, ELEPHAN, HORSE, CHARIOT, CANNON }

    public NAME name;
    public COLOR color;
    public String id;

    public Piece(NAME name, COLOR color, String id){
        this.color = color;
        this.name = name;
    }

}
