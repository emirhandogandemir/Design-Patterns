package StructuralPattern.flyweight.tetris;

public class Test {

    public static void main(String[] args) {
        Piece piece = null;

        for (int i=1;i<20;i++){

            int a = i % 3;

            if (a == 0){
                piece = PieceFactory.getPiece("I");
                piece.create("red", i*3, true);
            }else if (a == 1){
                piece = PieceFactory.getPiece("J");
                piece.create("blue", i*3, false);
            }else if (a == 2){
                piece = PieceFactory.getPiece("T");
                piece.create("green", i*3, true);
            }
        }
    }
}
