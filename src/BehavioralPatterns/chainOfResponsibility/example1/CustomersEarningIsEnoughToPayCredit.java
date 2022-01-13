package BehavioralPatterns.chainOfResponsibility.example1;

public class CustomersEarningIsEnoughToPayCredit extends CreditRequestBase{

    @Override
    public void executeProcess(Customer customer) {
            if (super.creditConfirmed){
                boolean isEnoughToPay =true;
                if(isEnoughToPay){
                    super.creditConfirmed=true;
                }else {
                    super.creditConfirmed=false;
                }

            }
    }
}
