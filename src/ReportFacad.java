public class ReportFacad {

    private ReportSetting setting;

    public ReportFacad(){
        this.setting = ReportSetting.getInstance();
    }

    public void setReportHeader(String header){
        setting.setReportHeader(header);
    }

    public void setReportFooter(String header){
        setting.setReportFooter(header);
    }

    public String GenerateReport(String type, Employee employee){
        ReportBuilder report;

        if (type == "YearsOfExperienceReport") {
                report = new YeasrOfExperienceReportBuilder();
                return report.buildReport(employee);
        } else if(type == "PayReport") {
            report = new PayReportBuilder();
            return report.buildReport(employee);
        } else{
            System.out.println("No such Report Exist in the system");
            return null;
        }

    }
    
}
