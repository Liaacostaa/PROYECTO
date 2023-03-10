package model;

public class Board {
        private Cell[][] cells;

        public Board(){
                cells = new Cell[8][8];
                //to create every cell
                for (int i = 0; i < 8; i++) {
                        for (int j = 0; j < 8; j++) {
                                cells[i][j] = new Cell(this, new Coordinate((char)('A'+j),i+1));
                        }
                }
        }

        public void placePieces(){
                Piece p;
                p = new KnightBlack(getCell(new Coordinate('B',8)));
                p.putInYourPlace();
                p = new KnightBlack(getCell(new Coordinate('C',6)));
                p.putInYourPlace();
                p = new KnightBlack(getCell(new Coordinate('D',8)));
                p.putInYourPlace();
        }

        public void highlight(Coordinate[] coordinates){
                for(Coordinate c : coordinates)
                        getCell(c).highlight();
        }

        public void resetColors(){
                for(Cell[] row : cells)
                        for(Cell c : row)
                                c.resetColor();
        }


        public Cell getCell(Coordinate coordinate){
                if(coordinate.getRow()<1 || coordinate.getRow()>8)
                        return null;
                if(coordinate.getColumn()<'A' || coordinate.getColumn()>'H')
                        return null;
                return cells[coordinate.getRow()-1][coordinate.getColumn()-'A'];
        }

        @Override
        public String toString() {
                String output = "   A  B  C  D  E  F  G  H\n";
                for (int i = 0; i < 8; i++) {
                        output += (i+1) + " ";
                        for (int j = 0; j < 8; j++) {
                                output += cells[i][j];
                        }
                        output += " " + (i+1) + "\n";
                }

                output += "   A  B  C  D  E  F  G  H";
                return output;
        }
}
