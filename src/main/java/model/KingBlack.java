package model;

import model.King;
import model.Piece;

public class KingBlack extends King {
    public KingBlack(Cell cell){
        super(Piece.Type.BLACK_KING, cell);
    }
}
