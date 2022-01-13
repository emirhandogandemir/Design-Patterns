package BehavioralPatterns.chainOfResponsibility.example2;

public class Para5 extends Banknot{
    @Override
    public Miktar paraCek(int tutar) {
        if (tutar>=10){
            return new Miktar(tutar/5,tutar%5,5);
        }else{
            return banknot.paraCek(tutar);
        }
    }
}
