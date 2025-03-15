public class YeasrOfExperienceReportBuilder extends ReportBuilder {

    @Override
    public String createMainReportContent(Employee employee) {
        MainReportContent content = new YearsOfExperienceReportContent();
        return content.makeMainReportContent(employee);
    }
    
}
