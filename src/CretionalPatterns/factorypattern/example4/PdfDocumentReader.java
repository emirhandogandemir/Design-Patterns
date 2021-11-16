package CretionalPatterns.factorypattern.example4;

public class PdfDocumentReader implements DocumentReader{
    @Override
    public void readDocument() {
        System.out.println("Pdf dosyası okunuyor");
    }
}
