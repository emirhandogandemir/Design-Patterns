package BehavioralPatterns.chainOfResponsibility.example1;

public class CheckGuarantorIsFıne extends CreditRequestBase{

    @Override
    public void executeProcess(Customer customer) {
    if(super.creditConfirmed){
        boolean quarantorIsFıne =true;
        if(quarantorIsFıne){
            super.creditConfirmed=true;
        }else {
            super.creditConfirmed=false;
        }
    }
    }
}
