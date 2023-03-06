package model;

public class Queen extends Piece {
    public Queen(Type type, Cell cell){
        super(type, cell);
    }

    @Override
    public Coordinate[] getNextMovements() {
        return
                Bishop.getNextMovementsAsBishop(this).
                        addAll(Rook.getNextMovementsAsRook(this)).toArray();
    }


}