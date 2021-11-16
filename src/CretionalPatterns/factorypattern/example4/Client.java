package CretionalPatterns.factorypattern.example4;

public class Client {
    public static void main(String[] args) {
        DocumentReaderFactory documentReaderFactory = new PdfDocumentReaderFactory();
        DocumentReader documentReader = documentReaderFactory.create();
        documentReader.readDocument();


        DocumentFactory documentFactory = new DocumentFactory();
        DocumentReader documentReader1 = documentFactory.get(new MsWordReaderFactory());
        documentReader1.readDocument();
    }
}
