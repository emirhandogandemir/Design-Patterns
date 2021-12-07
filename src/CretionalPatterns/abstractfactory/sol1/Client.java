package CretionalPatterns.abstractfactory.sol1;

public class Client {
    public Client(GUIFactory factory){
        Component component = factory.create();
        component.paint();
    }
}
