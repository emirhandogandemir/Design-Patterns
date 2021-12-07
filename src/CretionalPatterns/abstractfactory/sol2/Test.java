package CretionalPatterns.abstractfactory.sol2;

public class Test {
    public static void main(String[] args) {
        Client client = new Client(new GUIFactoryImpl());
    }
}
