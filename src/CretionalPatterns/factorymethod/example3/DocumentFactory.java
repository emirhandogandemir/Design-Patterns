package CretionalPatterns.factorymethod.example3;

public class DocumentFactory {
    public static Document createDocument(String type){
        if (type.equals("PDF")) return new Pdf();
        else if(type.equals("WORD")) return new Word();
        else throw new RuntimeException("Döküman tipi geçerli değil");
    }
}
