package StructuralPattern.facade.example4;

public class Televizyon {
    private int sesSeviye;
    private int kanalNumara;

    public void ac(int sayi){
        System.out.println("tc açıldı");
        setKanalNumara(1);
        setSesSeviye(0);
    }
    public void kapat(int sayi){
        System.out.println("tv kapatıldı");
    }
    public void sesAzalt(){
        setSesSeviye(getSesSeviye()-1);
    }
    public void sesArttır(){
        setSesSeviye(getSesSeviye()+1);
    }
    public void kanalArtır(){
        setKanalNumara(getKanalNumara()+1);
    }
    public void kanalAzalt(){
        setKanalNumara(getKanalNumara()-1);
    }

    public int getSesSeviye() {
        return sesSeviye;
    }

    public void setSesSeviye(int sesSeviye) {
        this.sesSeviye = sesSeviye;
    }

    public int getKanalNumara() {
        return kanalNumara;
    }

    public void setKanalNumara(int kanalNumara) {
        this.kanalNumara = kanalNumara;
    }
}
