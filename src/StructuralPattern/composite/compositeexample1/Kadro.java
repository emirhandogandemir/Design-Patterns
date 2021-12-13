package StructuralPattern.composite.compositeexample1;

import java.util.ArrayList;
import java.util.List;

public class Kadro extends Sirket {

    private List<Sirket> list = new ArrayList<>();

    public Kadro(String isim, Bolum departman) {
        super(isim, departman);
    }

    @Override
    public void ekle(Sirket sirket) {
        list.add(sirket);
    }

    @Override
    public void sil(Sirket sirket) {
        list.remove(sirket);
    }

    @Override
    public void yazdir(int satirbasi) {
        System.out.println(satirbasi + " " + isim + " " + departman + " ");
        for (Sirket sirket : list) {
            sirket.yazdir(satirbasi + 2);
        }
    }

}
