package StructuralPattern.adapter.adapterexample3;

public class Test {
    public static void main(String[] args) {
        IIO io = new BatchIoAdapter(new BatchIo());
        io.createFolder("@c a x.txt");

    }
}
