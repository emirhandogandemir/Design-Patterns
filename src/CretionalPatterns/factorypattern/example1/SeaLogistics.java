package CretionalPatterns.factorypattern.example1;

public class SeaLogistics extends Logistics {
    @Override
    public Transport getTransport() {
        return new Ship();
    }
}
