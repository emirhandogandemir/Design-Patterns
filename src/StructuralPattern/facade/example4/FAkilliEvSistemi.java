package StructuralPattern.facade.example4;

public class FAkilliEvSistemi {
    private Klima klima;
    private Isık isik;
    private Kapi kapi;
    private Televizyon televizyon;

    public FAkilliEvSistemi() {
        isik = new Isık(1);
        kapi = new Kapi();
        televizyon = new Televizyon();
        klima = new Klima();
    }

    public void KlimaAc(){
        klima.ac();
    }
    public void KlimaKapat(){
        klima.kapa();
    }

    public void IsikAc(int sayi){
        isik.ac(sayi);
    }

    public void IsikKapat(int sayi){
        isik.kapat(sayi);
    }

    public void TvAc(int sayi){
        televizyon.ac(sayi);
    }

    public void TvKapat(int sayi){
        televizyon.ac(sayi);
    }

    public void KapiKilitle(){
        kapi.Kilitle();
    }

    public void KapiKilitAc(){
        kapi.KilitAc();
    }
}
