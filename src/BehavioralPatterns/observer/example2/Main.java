package BehavioralPatterns.observer.example2;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setKullaniciAdi("Emirhan Doğandemir");
        customer.setTelefonNo("05541393831");
        customer.getObserverListesi().add(new MakeCampaignObserver());
        customer.getObserverListesi().add(new SendFreeCreditObserver());
    }
}
