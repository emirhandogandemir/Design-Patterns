package BehavioralPatterns.visitor.example2;

public class HyperLink extends DocumentPart{
    @Override
    public void Accept(IVisitor visitor) {
        visitor.Visit(this);
    }
}
