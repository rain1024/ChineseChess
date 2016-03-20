package com.magizbox.chinesechess.engine;

import java.util.ArrayList;
import java.util.List;

public class Game {
    public List<Piece> pieces;
    public Game() {
        pieces = new ArrayList<Piece>();
        pieces.add(new Piece(Piece.NAME.GENERAL, Piece.COLOR.RED, "rg"));
        pieces.add(new Piece(Piece.NAME.GENERAL, Piece.COLOR.GREEN, "gg"));
    }
}