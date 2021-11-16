package CretionalPatterns.factorypattern.example1;

public class Client {
    public static void main(String[] args) {
        Logistics logistics = new RoadLogistics();
        System.out.println( logistics.getTransport());
    }
}
