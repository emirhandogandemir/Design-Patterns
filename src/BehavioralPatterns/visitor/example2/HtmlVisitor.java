package BehavioralPatterns.visitor.example2;

public class HtmlVisitor extends IVisitor{
    @Override
    public void Visit(PlainText plainText) {
        System.out.println("plaintext htmle çevrildi");
    }

    @Override
    public void Visit(BoldText boldText) {
        System.out.println("boldtext htmle çevrildi");
    }

    @Override
    public void Visit(HyperLink hyperLink) {
        System.out.println("hyperLink htmle çevrildi");
    }
}
