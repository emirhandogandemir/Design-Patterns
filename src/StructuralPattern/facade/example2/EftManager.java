package StructuralPattern.facade.example2;

public class EftManager {
    public void sendEft(Customer customer,Customer toCustomer, double eftAmount){
        if(ControlManager.checkHasEnoughCashInBankAccount(customer,eftAmount)){
           double cashAmount = customer.getCashAmount()-eftAmount;
            customer.setCashAmount(cashAmount);
            System.out.println("Eft"+toCustomer.getCustomerNumber()+ "nolu hesaba gönderildi");
        }else {
            System.out.println("bakiye yetersiz eft işleminiz gerçekleştirilemedi");
        }

    }
}
