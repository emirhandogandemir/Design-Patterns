package BehavioralPatterns.chainOfResponsibility.example1;

public class CheckCreditCardPaymentTime extends CreditRequestBase{


    @Override
    public void executeProcess(Customer customer) {
        if(super.creditConfirmed){
            int paymentTime=1;
            if(paymentTime>3){
                super.creditConfirmed=false;
            }else {
                super.creditConfirmed=true;
            }
        }
    }
}
