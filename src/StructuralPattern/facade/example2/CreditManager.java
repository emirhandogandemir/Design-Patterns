package StructuralPattern.facade.example2;

public class CreditManager {
    public void useCredit(Customer customer){
        if(ControlManager.checkCanUserCredit(customer.getIdNo())){
            System.out.println("Kredi kullandırılmıştır");
        }else{
            System.out.println("Banka kredinizi onaylamamıştır");
        }
    }
}
