package CretionalPatterns.factorypattern.example5;

public class NormalSchool implements School{
    @Override
    public void openTime() {

    }

    @Override
    public void closeTime() {
        System.out.println("Normal okullar saat 5 te kapanmaktadır");
    }

    @Override
    public double quota() {
        return 0;
    }
}
