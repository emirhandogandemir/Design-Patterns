package CretionalPatterns.factorypattern.example4;

public class MsWordReader implements DocumentReader{
    @Override
    public void readDocument() {
        System.out.println("MsWord dosyası okundu");
    }
}
