package com.game.checkers.board;

import com.game.checkers.pieces.Piece;
import com.game.checkers.pieces.PositionOfPieces;
import com.game.checkers.pieces.WhitePieces;

import java.util.HashMap;
import java.util.Map;

public class Board {

    private Map<PositionOfPieces, Piece> board = new HashMap<>();
    private WhitePieces whitePieces = new WhitePieces();

    public Board() {
        //putAllPieces();
        this.board = board;

    }

    public Map<PositionOfPieces, Piece> getBoard() {
        return board;
    }

    public WhitePieces getWhitePieces() {
        return whitePieces;
    }

    public void putAllPieces() {
        board.putAll(whitePieces.setUpPieces());
    }


    public void setWhitePieces(WhitePieces whitePieces) {
        this.whitePieces = whitePieces;
    }
}
