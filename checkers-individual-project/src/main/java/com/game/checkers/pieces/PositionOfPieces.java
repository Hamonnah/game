package com.game.checkers.pieces;

import java.io.Serializable;
import java.util.Objects;

public class PositionOfPieces implements Serializable {

    private int col;
    private int row;

    public PositionOfPieces(int col, int row) {
        this.col = col;
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PositionOfPieces)) return false;
        PositionOfPieces that = (PositionOfPieces) o;
        return col == that.col &&
                row == that.row;
    }

    @Override
    public int hashCode() {
        return Objects.hash(col, row);
    }
}
