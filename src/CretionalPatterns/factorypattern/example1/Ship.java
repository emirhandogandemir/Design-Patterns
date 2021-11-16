package CretionalPatterns.factorypattern.example1;

public class Ship implements Transport{
    @Override
    public String deliver() {
        return "Deniz yolu ile taşınıcak";
    }
}
