package BehavioralPatterns.visitor.example1;



public class GalaxyTab extends Tablet {
    public GalaxyTab(String model, String marka) {
        super(model, marka);
    }

    @Override
    public void Accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
