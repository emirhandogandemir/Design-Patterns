package StructuralPattern.facade.example2;

public class Facade {

    private EftManager eftManager;
    private CreditManager creditManager;

    public Facade() {
        this.eftManager = new EftManager();
        this.creditManager = new CreditManager();
    }

    public void sendEft(Customer fromCustomer,Customer toCustomer,double eftAmount){
        eftManager.sendEft(fromCustomer,toCustomer,eftAmount);
    }

    public void useCredit(Customer customer){
        creditManager.useCredit(customer);
    }
}
