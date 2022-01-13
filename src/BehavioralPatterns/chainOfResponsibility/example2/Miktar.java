package BehavioralPatterns.chainOfResponsibility.example2;

public class Miktar {
    private int adet;
    private int kalan;
    private int tutar;

    public Miktar(int adet, int kalan, int tutar) {
        this.adet = adet;
        this.kalan = kalan;
        this.tutar = tutar;
    }

    public Miktar() {

    }

    public int getAdet() {
        return adet;
    }

    public void setAdet(int adet) {
        this.adet = adet;
    }

    public int getKalan() {
        return kalan;
    }

    public void setKalan(int kalan) {
        this.kalan = kalan;
    }

    public int getTutar() {
        return tutar;
    }

    public void setTutar(int tutar) {
        this.tutar = tutar;
    }
}
