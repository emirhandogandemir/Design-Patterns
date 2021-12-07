package CretionalPatterns.abstractfactory.sol1;

public class ListFactory implements GUIFactory{
    @Override
    public Component create() {
        return new List();
    }
}
