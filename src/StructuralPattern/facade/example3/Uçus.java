package StructuralPattern.facade.example3;

public class Uçus {
    private String baslangıcKonumu;

    private String hedefKonumu;

    private String sınıf;

    public Uçus(String baslangıcKonumu, String hedefKonumu, String sınıf) {
        this.baslangıcKonumu = baslangıcKonumu;
        this.hedefKonumu = hedefKonumu;
        this.sınıf = sınıf;
    }

    public String getBaslangıcKonumu() {
        return baslangıcKonumu;
    }

    public void setBaslangıcKonumu(String baslangıcKonumu) {
        this.baslangıcKonumu = baslangıcKonumu;
    }

    public String getHedefKonumu() {
        return hedefKonumu;
    }

    public void setHedefKonumu(String hedefKonumu) {
        this.hedefKonumu = hedefKonumu;
    }

    public String getSınıf() {
        return sınıf;
    }

    public void ucusAyarla(){
        System.out.println(sınıf +" kalitesinde "+hedefKonumu +" mevkiine "+baslangıcKonumu+"baslangıc konumundan");
    }




    public void setSınıf(String sınıf) {
        this.sınıf = sınıf;
    }
}
