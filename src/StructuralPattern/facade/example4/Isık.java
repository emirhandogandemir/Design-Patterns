package StructuralPattern.facade.example4;

public class Isık {
    private  boolean [] durum;
    public Isık(int adet){
        durum = new boolean[adet];
    }

    public void ac(int index){
        durum[index]=true;
    }
    public void kapat(int index){
        durum[index]=false;
    }
}
