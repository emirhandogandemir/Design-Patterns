package StructuralPattern.bridge.example1;

public class WebFormatImpl implements ReportFormatService{
    @Override
    public void generate() {

        System.out.println("Rapor Web Formatında Oluşturuldu");

    }
}
