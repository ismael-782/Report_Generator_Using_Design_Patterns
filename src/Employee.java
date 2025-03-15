public class Employee {

    private String name;
    private String jobTitle;
    private double salary;
    private int yearsOfExperience;

    public Employee(String name, String jobTitle, double salary, int yearsOfExperience) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public String generateYearsOfExperienceReport(){
        ReportFacad facad = new ReportFacad();
        return facad.GenerateReport("YearsOfExperienceReport", this);
    }

    public String generatePayReport(){
        ReportFacad facad = new ReportFacad();
        return facad.GenerateReport("PayReport", this);
    }

    public void changeHeader(String header){
        ReportFacad facad = new ReportFacad();
        facad.setReportHeader(header);
    }

    public void changeFooter(String footer){
        ReportFacad facad = new ReportFacad();
        facad.setReportFooter(footer);
    }
}