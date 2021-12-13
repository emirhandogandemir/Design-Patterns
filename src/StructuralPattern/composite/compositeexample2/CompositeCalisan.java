package StructuralPattern.composite.compositeexample2;



import java.util.ArrayList;
import java.util.List;

public class CompositeCalisan extends Calisan{
    List<Calisan> list= new ArrayList<>();

    public CompositeCalisan(String ad, Poziyon poziyon) {
        super(ad, poziyon);

    }

    @Override
    public void goster() {
        System.out.println(ad + " " + poziyon + " ");
    }

    public void ekle(Calisan calisan){
        list.add(calisan);
    }
}
