public class Main {
    public static void main(String[] args) {

        ReportGenerator reportGenerator = new ReportGenerator("C:\\personelPerformans.xslx");
        System.out.println(reportGenerator.getReportFormat());

        ReportGenerator gen2 = new ReportGenerator("C:\\detayliAnaliz.xlsx");

        ReportGenerator gen3 = new ReportGenerator("C:\\finans2025.xlsx","HTML");
    }
}