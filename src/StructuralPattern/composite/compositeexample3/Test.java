package StructuralPattern.composite.compositeexample3;

public class Test {
    public static void main(String[] args) {
        CompositeDealers genelMudurluk = new CompositeDealers();
        CompositeDealers icAnadoluGenelMudurluk = new CompositeDealers();
        CompositeDealers ankarabolgesi = new CompositeDealers();
        CompositeDealers ankara1 = new CompositeDealers();
        CompositeDealers ankara2 = new CompositeDealers();
        CompositeDealers sivas1 = new CompositeDealers();
        CompositeDealers sivasBolgesi = new CompositeDealers();


        ankara1.add(new WorkingPerson());
        ankara1.add(new WorkingPerson());
        ankara1.add(new WorkingPerson());
        ankara2.add(new WorkingPerson());
        ankara2.add(new WorkingPerson());

        ankarabolgesi.add(ankara1);
        ankarabolgesi.add(ankara2);

        sivas1.add(new WorkingPerson());

        sivasBolgesi.add(sivas1);

        icAnadoluGenelMudurluk.add(ankarabolgesi);
        icAnadoluGenelMudurluk.add(sivasBolgesi);

        genelMudurluk.add(icAnadoluGenelMudurluk);
    }
}
