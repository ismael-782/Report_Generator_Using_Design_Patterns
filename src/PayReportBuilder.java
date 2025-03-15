public class PayReportBuilder extends ReportBuilder {

    @Override
    public String createMainReportContent(Employee employee) {
        MainReportContent content = new PayReportContent();
        return content.makeMainReportContent(employee);
    }
    
}
