public class PayReportContent extends MainReportContent {
    
    public String makeMainReportContent(Employee employee){
        return super.makeMainReportContent(employee) + 
        "Job Title: " + employee.getJobTitle() + "\n" +
        "Salary: " + employee.getSalary() + "\n";
    }
}
