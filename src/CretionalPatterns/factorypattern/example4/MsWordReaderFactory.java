package CretionalPatterns.factorypattern.example4;

public class MsWordReaderFactory implements DocumentReaderFactory{
    @Override
    public DocumentReader create() {
        return new MsWordReader();
    }
}
