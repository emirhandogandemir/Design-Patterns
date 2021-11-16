package CretionalPatterns.factorymethod.example1;

public class Truck implements Transport{

    @Override
    public String deliver() {
        return "bir kutuda kara üzerinden taşınıcak";
    }
}
