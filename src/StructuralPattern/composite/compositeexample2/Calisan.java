package StructuralPattern.composite.compositeexample2;

public abstract class Calisan {
    protected String ad;
    protected Poziyon poziyon;

    public Calisan(String ad, Poziyon poziyon) {
        this.ad = ad;
        this.poziyon = poziyon;
    }

    public abstract void goster();
}
