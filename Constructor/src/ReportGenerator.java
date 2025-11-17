public class ReportGenerator {

    private String reportFormat;
    private String excelFilePath;


    public String getReportFormat() {
        return reportFormat;
    }

    public void setReportFormat(String reportFormat) {
        this.reportFormat = reportFormat;
    }

//    public ReportGenerator(){
//        reportFormat = "PDF";
//    }

    public ReportGenerator(String filePath){
        excelFilePath = filePath;
        reportFormat ="PDF";
    }

    public ReportGenerator(String excelFilePath, String reportFormat){
        this.excelFilePath = excelFilePath;
        this.reportFormat = reportFormat;


    }


}
