package StructuralPattern.bridge.example1;

public class SalesReport extends Report{


    public SalesReport(ReportFormatService reportFormatService) {
        super(reportFormatService);
    }

    @Override
    public void display() {
        System.out.println("satış raporu ");
    }

}
