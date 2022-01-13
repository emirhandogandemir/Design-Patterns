package BehavioralPatterns.chainOfResponsibility.example1;

public class CheckKbbScore extends CreditRequestBase{


    @Override
    public void executeProcess(Customer customer) {

        int kbbScore=1200;
        if(kbbScore>1000){
            super.creditConfirmed=true;
        }
        else {
            super.creditConfirmed=false;
        }

    }
}
