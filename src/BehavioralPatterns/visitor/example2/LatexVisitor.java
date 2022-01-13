package BehavioralPatterns.visitor.example2;

public class LatexVisitor extends IVisitor{
    @Override
    public void Visit(PlainText plainText) {
        System.out.println("plaintext latexvisitor formatında yazıldı");
    }

    @Override
    public void Visit(BoldText boldText) {
        System.out.println("boldText latexvisitor formatında yazıldı");
    }

    @Override
    public void Visit(HyperLink hyperLink) {
        System.out.println("hyperLink latexvisitor formatında yazıldı");
    }
}
