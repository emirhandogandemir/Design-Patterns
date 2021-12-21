package StructuralPattern.facade.example4;

public class Klima {
    private int sicaklik;

    public int getSicaklik() {
        return sicaklik;
    }

    public void setSicaklik(int sicaklik) {
        this.sicaklik = sicaklik;
    }
    public void guncelle(){

    }

    public void ac(){
        System.out.println("klima açıldı");
    }
    public void kapa(){
        System.out.println("klima kapatıldı");
    }
}
