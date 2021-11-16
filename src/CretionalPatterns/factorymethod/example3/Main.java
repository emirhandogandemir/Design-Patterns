package CretionalPatterns.factorymethod.example3;

public class Main {
    public static void main(String[] args) {
        Document document = DocumentFactory.createDocument("PDF");
        System.out.println(document.getDocumentType());

        Document document1 = DocumentFactory.createDocument("WORD");
        System.out.println(document1);
    }
}
