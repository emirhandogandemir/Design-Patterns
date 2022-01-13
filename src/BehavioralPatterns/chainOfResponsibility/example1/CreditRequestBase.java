package BehavioralPatterns.chainOfResponsibility.example1;

public abstract class CreditRequestBase {
    public boolean creditConfirmed;

    protected CreditRequestBase nextOperation;

    public void setNext(CreditRequestBase operation){
        this.nextOperation=operation;
    }
    public void execute(Customer customer){
        executeProcess(customer);
        if(this.nextOperation!=null){
            this.nextOperation.creditConfirmed=this.creditConfirmed;

            //bir sonraki çalıştırılır
            this.nextOperation.execute(customer);
        }
    }

    public abstract void executeProcess(Customer customer);
}
