package BehavioralPatterns.visitor.example2;

public class Main {
    public static void main(String[] args) {

        PlainText plainText = new PlainText();
        HyperLink hyperLink = new HyperLink();
        BoldText boldText = new BoldText();
        plainText.text="aekpoakedpoakdpaoekdpaoekdpaokdpaokdopae";
        hyperLink.text="qaokdeopakdpoakedpoaekdpoae";
        boldText.text="kemdaekdpoakedopak";

        IVisitor iVisitor = new HtmlVisitor();
        boldText.Accept(iVisitor);
        hyperLink.Accept(iVisitor);
        plainText.Accept(iVisitor);
        System.out.println("çıktınız :   "  +iVisitor.getOutput());
    }
}
