package CretionalPatterns.factorypattern.example4;

public class DocumentFactory {
    public DocumentReader get(DocumentReaderFactory factory){
        return factory.create();
    }
}
