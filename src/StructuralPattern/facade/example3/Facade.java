package StructuralPattern.facade.example3;

public class Facade {

    private Taksi taksi;
    private Otel otel;
    private Uçus uçus;

    public Facade(String baslangıcKonumu, String hedefKonumu, String sınıf) {
        taksi = new Taksi(sınıf);
        otel = new Otel(sınıf, hedefKonumu);
        uçus = new Uçus(baslangıcKonumu, hedefKonumu, sınıf);

    }

    public void rezervasyonYap() {
        taksi.taksiCagır();
        otel.otelKirala();
        uçus.ucusAyarla();
    }
}
