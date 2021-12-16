package StructuralPattern.bridge.example1;

public class DesktopFormat implements ReportFormatService{
    @Override
    public void generate() {
        System.out.println("Rapor Desktop Formatında oluşturuldu");
    }
}
