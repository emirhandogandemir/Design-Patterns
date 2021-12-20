package StructuralPattern.facade.example3;

public class Taksi {
    private String sınıf;

    public Taksi(String sınıf) {
        this.sınıf = sınıf;
    }

    public String getSınıf() {
        return sınıf;
    }

    public void setSınıf(String sınıf) {
        this.sınıf = sınıf;
    }

    public void taksiCagır(){
        System.out.println(sınıf +" kalitesinde taksi çağrıldı");
    }
}
