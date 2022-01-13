package BehavioralPatterns.visitor.example2;

public abstract class DocumentPart {
    public String text;
    public abstract void Accept(IVisitor visitor);


}
