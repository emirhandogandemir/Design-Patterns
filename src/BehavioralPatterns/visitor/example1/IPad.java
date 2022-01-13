package BehavioralPatterns.visitor.example1;

import StructuralPattern.flyweight.tetris.T;

public class IPad extends Tablet {


    public IPad(String model, String marka) {
        super(model, marka);
    }

    @Override
    public void Accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
