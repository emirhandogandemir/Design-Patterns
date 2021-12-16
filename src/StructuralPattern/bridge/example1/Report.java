package StructuralPattern.bridge.example1;

public abstract class Report {

    private ReportFormatService reportFormatService;

    public Report(ReportFormatService reportFormatService) {
        this.reportFormatService = reportFormatService;
    }
    public abstract void display();
}
