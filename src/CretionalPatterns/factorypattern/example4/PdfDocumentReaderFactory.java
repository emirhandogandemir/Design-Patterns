package CretionalPatterns.factorypattern.example4;

public class PdfDocumentReaderFactory implements DocumentReaderFactory{
    @Override
    public DocumentReader create() {
        return new PdfDocumentReader();
    }
}
