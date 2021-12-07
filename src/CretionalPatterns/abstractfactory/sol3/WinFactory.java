package CretionalPatterns.abstractfactory.sol3;

public class WinFactory implements GUIFactory{
    @Override
    public Component createButton() {
        return new WinButton();
    }

    @Override
    public Component createList() {
        return new WinList();
    }

    @Override
    public Component createTable() {
        return new WinTable();
    }
}
