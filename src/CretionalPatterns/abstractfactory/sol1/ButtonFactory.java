package CretionalPatterns.abstractfactory.sol1;

public class ButtonFactory implements GUIFactory{
    @Override
    public Component create() {
        return new Button();
    }
}
