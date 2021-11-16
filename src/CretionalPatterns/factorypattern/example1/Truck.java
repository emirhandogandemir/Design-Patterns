package CretionalPatterns.factorypattern.example1;

public class Truck implements Transport{
    private String name;
    @Override
    public String deliver() {
        return "bir kutuda kara üzerinden taşınıcak";
    }
}
