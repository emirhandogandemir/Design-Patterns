package StructuralPattern.composite.compositeexample1;

public class Test {
    public static void main(String[] args) {

        Kadro kadro = new Kadro("bilal",Bolum.Junior);
        kadro.ekle(new Yazilim("Emirhan",Bolum.Junior));
        Yazilim yazilim = new Yazilim("Ömer",Bolum.Test);

             kadro.yazdir(1);

    }
}
