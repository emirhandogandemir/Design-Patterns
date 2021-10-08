package CretionalPatterns.factory;

public class BmwFactory extends CarFactory{
    @Override
    public void createAuto() {
        getCarList().add(new BmwZ4(170));
    }

}
