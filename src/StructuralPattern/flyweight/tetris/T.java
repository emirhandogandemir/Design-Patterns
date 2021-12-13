package StructuralPattern.flyweight.tetris;

public class T implements Piece {

    private String label;

    public T(){
        label = "T";
    }

    public void create(String color, int speed, boolean irreversible) {

        System.out.println("Piece is " + label + ", color: " + color + ", speed: " + speed + ", irreversible: " + irreversible);
    }
}
