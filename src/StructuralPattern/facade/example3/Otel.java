package StructuralPattern.facade.example3;

public class Otel {
    private String sınıf;

    private String hedefKonum;

    public Otel(String sınıf,String hedefKonum) {
        this.sınıf = sınıf;
        this.hedefKonum=hedefKonum;
    }

    public String getSınıf() {
        return sınıf;
    }

    public void setSınıf(String sınıf) {
        this.sınıf = sınıf;
    }
    public String getHedefKonum() {
        return hedefKonum;
    }

    public void setHedefKonum(String hedefKonum) {
        this.hedefKonum = hedefKonum;
    }
    public void otelKirala(){
        System.out.println(sınıf +" yıldızında otel kiralandı" +hedefKonum +" uzaklığındadır");
    }
}
