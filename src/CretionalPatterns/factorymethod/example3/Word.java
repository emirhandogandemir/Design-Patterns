package CretionalPatterns.factorymethod.example3;



public class Word implements Document {
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getDocumentType() {
        return "WORD";
    }
}
