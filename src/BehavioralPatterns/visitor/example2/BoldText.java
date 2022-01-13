package BehavioralPatterns.visitor.example2;

public class BoldText extends DocumentPart{
    @Override
    public void Accept(IVisitor visitor) {
        visitor.Visit(this);
    }
}
