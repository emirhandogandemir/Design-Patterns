package BehavioralPatterns.observer.example1;

import java.util.ArrayList;

public abstract class AbsUrun {

private double fiyat;

private String urunAdi;

private ArrayList<IUye> uyeList = new ArrayList<>();


    public AbsUrun(double fiyat, String urunAdi) {
        this.fiyat = fiyat;
        this.urunAdi = urunAdi;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        if (fiyat<100){
            this.fiyat=fiyat;
            notifyUrun();
        }
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public ArrayList<IUye> getUyeList() {
        return uyeList;
    }

    public void setUyeList(ArrayList<IUye> uyeList) {
        this.uyeList = uyeList;
    }

    public void notifyUrun(){
        for(IUye uye : uyeList){
            uye.update(this);
        }
    }

}
