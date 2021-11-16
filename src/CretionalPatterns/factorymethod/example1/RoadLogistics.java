package CretionalPatterns.factorymethod.example1;

public class RoadLogistics extends Logistics{
    @Override
    public Transport getTransport() {
        return new Truck();
    }
}
