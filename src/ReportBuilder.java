public abstract class ReportBuilder {


    private ReportSetting reportSetting = ReportSetting.getInstance();

    public String buildReport(Employee employee) {

        StringBuilder report = new StringBuilder();
        // Add header, main content, and footer
        report.append(addReportHeader());
        report.append(createMainReportContent(employee));
        report.append(addReportFooter());
        
        return report.toString();
    }

    public String addReportHeader() {
        return reportSetting.getReportHeader();  
    }

    public abstract String createMainReportContent(Employee employee);
        

    public String addReportFooter() {
        return reportSetting.getReportFooter();
    }
}