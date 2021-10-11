package CretionalPatterns.factorymethod;

// Kullanıcın istediği bir tipte döküman oluşturulmasını sağlar .

public class DocumentFactory {
    public static Document createDocument(final String type){
        if(type.equals("PDF")){
            return new Pdf();
        }
        else if(type.equals("WORD")){
            return new Word();
        }else {
            throw new RuntimeException("Döküman tipi belli değil");
        }
    }
}
