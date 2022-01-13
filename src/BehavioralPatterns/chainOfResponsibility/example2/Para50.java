package BehavioralPatterns.chainOfResponsibility.example2;

public class Para50 extends Banknot{
    @Override
    public Miktar paraCek(int tutar) {
        if (tutar>=50){
            return new Miktar(tutar/50,tutar%50,50);
        }else{
            return banknot.paraCek(tutar);
        }
    }
}
