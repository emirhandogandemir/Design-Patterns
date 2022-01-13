package BehavioralPatterns.chainOfResponsibility.example2;

public abstract class Banknot {

    protected Banknot banknot;
    public void sonraki(Banknot banknot){
        this.banknot=banknot;
    }

    public abstract Miktar paraCek(int tutar);

}
