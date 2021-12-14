package StructuralPattern.facade.example2;

public class ControlManager {

    public static boolean checkHasEnoughCashInBankAccount(Customer customer,double amount){
        if(customer.getCashAmount()>=amount){
            return true;
        }else {
            return false;
        }
    }

    public static boolean checkCanUserCredit(String IdNo){
        return true;
    }
}
