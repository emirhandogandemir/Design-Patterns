package CretionalPatterns.factory;

/*
Audi marka arabaları üretir. Car Factory sınıfının altsınıfı olduğu için createAuto metodunu implemente eder
 */

public class AudiFactory extends CarFactory{

    /*
    CarFactory sınıfında yer alan createAuto() metodu Audi altsınıfından implemente edilir . Bu metot Audi markasına ait A4 ve R8
    modellerinin üretimi için kullanılmaktadır.
     */

    @Override
    public void createAuto() {
        getCarList().add(new AudiA4(200));
        getCarList().add(new AudiR8(168));
    }
}
