public abstract class MainReportContent {

    public String makeMainReportContent(Employee employee) {
        return "Employee Report\n" +
               "Name: " + employee.getName() + "\n";
    }
}