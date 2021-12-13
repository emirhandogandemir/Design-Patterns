package StructuralPattern.adapter.adapterexample3;

public class BatchIo {
    public void dosyaOlusturma(String dosyaYolu){
        System.out.println("batch ıo dosya oluşturma");
    }
    public void klasörOluşturma(String klasörOluştur){
        System.out.println("batch ıo ile klasör oluştur");
    }
    public void kopyala(String kaynak,String hedef){
        System.out.println("Batch ıo ile kopyalama işlemini yap");
    }
}
