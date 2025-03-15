public class YearsOfExperienceReportContent extends MainReportContent {
    
    public String makeMainReportContent(Employee employee){
        return super.makeMainReportContent(employee) + 
        "Job Title: " + employee.getJobTitle() + "\n" +
        "Years of Experience: " + employee.getYearsOfExperience() + "\n";
    }

}
