package com.game.checkers.pieces;

import java.util.HashMap;
import java.util.Map;

public class WhitePieces implements Pieces {

    private final Map<PositionOfPieces, Piece> whitePiecesMap = new HashMap<>();

    @Override
    public Map<PositionOfPieces, Piece> setUpPieces() {
        whitePiecesMap.put(new PositionOfPieces(1, 5), new Piece());
        whitePiecesMap.put(new PositionOfPieces(1, 3), new Piece());

        return setUpPieces();
    }

    public Map<PositionOfPieces, Piece> getWhitePiecesMap() {
        return whitePiecesMap;
    }

}
