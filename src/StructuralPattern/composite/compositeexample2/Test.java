package StructuralPattern.composite.compositeexample2;

public class Test {
    public static void main(String[] args) {
        CompositeCalisan genelMudur = new CompositeCalisan("ali",Poziyon.GenelMudur);
        CompositeCalisan Mudur = new CompositeCalisan("ENES",Poziyon.Mudur);
        Mudur.ekle(new LeafCalisan("mehmet",Poziyon.Mudur));
        Mudur.ekle(new LeafCalisan("mudur",Poziyon.Mudur));
        genelMudur.ekle(Mudur);
        genelMudur.goster();


    }
}
