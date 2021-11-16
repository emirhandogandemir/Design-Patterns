package CretionalPatterns.factorypattern.example5;

public class PrivateSchool implements School{
    @Override
    public void openTime() {

    }

    @Override
    public void closeTime() {
        System.out.println("private okullar 24 saat açıktır");
    }

    @Override
    public double quota() {
        return 0;
    }
}
