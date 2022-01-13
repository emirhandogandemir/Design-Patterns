package BehavioralPatterns.observer.example2;

public class MakeCampaignObserver implements IObserver{
    @Override
    public void notify(Customer customer) {
        System.out.println(customer.getTelefonNo() +" numarasına sahip " + customer.getKullaniciAdi()+" adlı kullanıcıya mesaj gönderildi");
    }
}
