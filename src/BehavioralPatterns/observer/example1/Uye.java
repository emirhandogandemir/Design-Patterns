package BehavioralPatterns.observer.example1;

import BehavioralPatterns.observer.example1.AbsUrun;
import BehavioralPatterns.observer.example1.IUye;

public class Uye implements IUye {

    private String email;

    public Uye(String email) {
        this.email = email;
    }

    @Override
    public void update(AbsUrun urun) {
        System.out.println(urun.getUrunAdi() + " adlı ürünün fiyatı : " + urun.getFiyat() +" şu fiyata değiştirilmiştir "+email);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
