package BehavioralPatterns.chainOfResponsibility.example1;

import CretionalPatterns.abstractfactory.sol3.List;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList <CreditRequestBase> creditOperations = new ArrayList<>();
        creditOperations.add(new CheckKbbScore());
        creditOperations.add(new CheckCreditCardPaymentTime());
        creditOperations.add(new CheckGuarantorIsFıne());
        creditOperations.add(new CheckCompanyCustomerWork());
        creditOperations.add(new CustomersEarningIsEnoughToPayCredit());

        creditOperations.get(0).setNext(creditOperations.get(1));
        creditOperations.get(1).setNext(creditOperations.get(2));
        creditOperations.get(2).setNext(creditOperations.get(3));
        creditOperations.get(3).setNext(creditOperations.get(4));

        creditOperations.get(0).execute(new Customer());
        boolean creditConfirmed= creditOperations.get(creditOperations.size()-1).creditConfirmed;
        if(creditConfirmed){
            System.out.println("Kredi isteği onaylandı");

        }else {
            System.out.println("Kredi isteği reddedildi");
        }
    }
}
