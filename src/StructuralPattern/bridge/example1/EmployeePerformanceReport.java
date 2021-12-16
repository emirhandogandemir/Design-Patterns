package StructuralPattern.bridge.example1;

public class EmployeePerformanceReport extends Report{


    public EmployeePerformanceReport(ReportFormatService reportFormatService) {
        super(reportFormatService);
    }

    @Override
    public void display() {
        System.out.println("çalışan performans raporu");
    }
}
