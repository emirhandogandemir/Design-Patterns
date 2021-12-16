package StructuralPattern.bridge.example1;

public class Main {
    public static void main(String[] args) {
        Report report1 = new SalesReport(new DesktopFormat());
        report1.display();
        System.out.println();

        Report report2 = new EmployeePerformanceReport(new WebFormatImpl());
        report2.display();

    }
}
