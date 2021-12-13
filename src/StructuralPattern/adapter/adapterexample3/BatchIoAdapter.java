package StructuralPattern.adapter.adapterexample3;

public class BatchIoAdapter implements IIO {

    private BatchIo batchIo;

    public BatchIoAdapter(BatchIo batchIo) {
        this.batchIo = batchIo;
    }

    @Override
    public void createTextFile(String path) {
        batchIo.dosyaOlusturma(path);
    }

    @Override
    public void createFolder(String path) {
        batchIo.klasörOluşturma(path);
    }

    @Override
    public void copy(String source, String destination) {
        batchIo.kopyala(source, destination);
    }
}
