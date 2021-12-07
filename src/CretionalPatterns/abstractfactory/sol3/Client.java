package CretionalPatterns.abstractfactory.sol3;

public class Client {
    public Client(GUIFactory factory){
        Component component = factory.createButton();
        component.paint();

        Component component1 = factory.createList();
        component1.paint();

        Component component2 = factory.createTable();
        component2.paint();
    }
}
