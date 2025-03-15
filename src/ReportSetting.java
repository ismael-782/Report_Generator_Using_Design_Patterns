public class ReportSetting {

    private static ReportSetting instance;
    private String reporHeader;
    private String reportFooter;

    private ReportSetting(){
        this.reporHeader = "=== Report Header ===\n";
        this.reportFooter = "\n=== Report Footer ===";
    }

    public static ReportSetting getInstance(){
        if(instance == null){
            synchronized(ReportSetting.class){
                if(instance == null){
                    instance = new ReportSetting();
                }
            }
        }
        return instance;
    }

    public String getReportHeader() {
        return reporHeader;
    }

    public String getReportFooter() {
        return reportFooter;
    }


    public void setReportHeader(String reporHeader) {
        this.reporHeader = reporHeader + "\n";
    }

    public void setReportFooter(String reportFooter) {
        this.reportFooter = "\n" + reportFooter;
    }



}
