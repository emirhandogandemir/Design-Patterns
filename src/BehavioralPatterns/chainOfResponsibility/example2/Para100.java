package BehavioralPatterns.chainOfResponsibility.example2;

public class Para100 extends Banknot{

    @Override
    public Miktar paraCek(int tutar) {
        if (tutar>=100){
            return new Miktar(tutar/100,tutar%100,100);
        }else{
            return banknot.paraCek(tutar);
        }
    }
}
