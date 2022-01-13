package BehavioralPatterns.observer.example2;

import jdk.jfr.Timespan;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Timer;

public class Customer {

    private Timer timer = new Timer();
    private String telefonNo;
    private String kullaniciAdi;
    private LocalDate sonKontrolYuklemeTarihi;

    public ArrayList<IObserver> observerListesi;

    public Customer(){
        observerListesi = new ArrayList<>();
        sonKontrolYuklemeTarihi = LocalDate.now();
    }
    public void observerlaraHaberVer(){
        for (IObserver observer : observerListesi){
            observer.notify(this);
        }
    }

    public void yeniGozlemciEkle(IObserver observer){
        if(!observerListesi.contains(observer))
            observerListesi.add(observer);
    }

    public ArrayList<IObserver> getObserverListesi() {
        return observerListesi;
    }

    public void setObserverListesi(ArrayList<IObserver> observerListesi) {
        this.observerListesi = observerListesi;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }
}
