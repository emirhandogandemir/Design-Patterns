package BehavioralPatterns.observer.example2;

public class SendFreeCreditObserver implements IObserver{
    @Override
    public void notify(Customer customer) {
        System.out.println(customer.getTelefonNo() + " adlı telefon numarasına sahip "+ customer.getKullaniciAdi() + " adlı kullanıcıya bedava kontör gönderildi");
    }
}
