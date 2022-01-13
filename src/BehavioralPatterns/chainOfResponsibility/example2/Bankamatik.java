package BehavioralPatterns.chainOfResponsibility.example2;

import java.util.ArrayList;
import java.util.List;

public class Bankamatik {
    Para5 para5 = new Para5();
    Para10 para10 = new Para10();
    Para20 para20 = new Para20();
    Para50 para50 = new Para50();
    Para100 para100 = new Para100();
    Para200 para200 = new Para200();

    public List<Miktar> paraCek(int tutar){
        System.out.println("Toplam Tutar : "+tutar);
        para200.sonraki(para100);
        para100.sonraki(para50);
        para50.sonraki(para20);
        para20.sonraki(para10);
        para10.sonraki(para5);
        Miktar sonuc = new Miktar();
        List<Miktar> sonuclar = new ArrayList<>();
        do{
            sonuclar.add(sonuc=para200.paraCek(tutar));
            tutar= sonuc.getKalan();
        }while (sonuc.getKalan()>0);
        for (Miktar miktar : sonuclar){
            System.out.println("Tutar : "+sonuc.getTutar() + " \tAdet "+sonuc.getAdet());
        }
            return null;
    }
}
