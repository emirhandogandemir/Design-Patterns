package StructuralPattern.composite.compositeexample1;

public class Yazilim extends Sirket{

    public Yazilim(String isim, Bolum departman) {
        super(isim, departman);
    }

    @Override
    public void yazdir(int satirbasi) {
        System.out.println("-"+satirbasi + " "+isim +" ");
    }
}
