package StructuralPattern.composite.compositeexample1;

public abstract class Sirket {
    protected String isim;
    protected Bolum departman;

    public Sirket(String isim, Bolum departman) {
        this.isim = isim;
        this.departman = departman;
    }


    public abstract void yazdir(int satirbasi);
}
