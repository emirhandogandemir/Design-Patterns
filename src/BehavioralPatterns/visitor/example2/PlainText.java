package BehavioralPatterns.visitor.example2;

public class PlainText extends DocumentPart{
    @Override
    public void Accept(IVisitor visitor) {
        visitor.Visit(this);
    }
}
