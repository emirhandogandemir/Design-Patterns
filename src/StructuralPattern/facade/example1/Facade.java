package StructuralPattern.facade.example1;

public class Facade {
    Sistem1Kontrol sistem1Kontrol;
    Sistem2Operations sistem2Operations;
    TcKimlikSistem tcKimlikSistem;

    public Facade(Sistem1Kontrol sistem1Kontrol, Sistem2Operations sistem2Operations, TcKimlikSistem tcKimlikSistem) {
        this.sistem1Kontrol = sistem1Kontrol;
        this.sistem2Operations = sistem2Operations;
        this.tcKimlikSistem = tcKimlikSistem;
    }

    public void sistemUyeEkle(String tc){
        if(tcKimlikSistem.kontrol(tc)&& !sistem1Kontrol.karaListeKontrol(tc)){
            sistem2Operations.uyeEkle(tc);
        }
    }
}
