import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // List of employees
        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(new Employee("John", "Front-End Dev", 25000, 10));
        empList.add(new Employee("Jane", "Back-End Dev", 30000, 15));
        empList.add(new Employee("Bob", "Flutter Dev", 20000, 8));
        empList.add(new Employee("Alice", "Designer", 35000, 20));
        empList.add(new Employee("Mike", "Project Manager", 28000, 12));

        Scanner inpScanner = new Scanner(System.in);

        System.out.println("Hello, Enter the name of the employee you want to search for:");
        Employee chosenEmp = null; // Proper initialization of chosenEmp

        // Search for the employee
        while (true) {
            String name = inpScanner.nextLine().trim();
            boolean found = false;

            for (Employee emp : empList) {
                if (emp.getName().equalsIgnoreCase(name)) { // Ignore case during comparison
                    chosenEmp = emp;
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println("Employee found: " + chosenEmp.getName());
                break; // Exit the loop once the employee is found
            } else {
                System.out.println("This employee is not in the system. Please try again...");
            }
        }

        // Display report options
        System.out.println(
                "\nWrite the Report number you want to print among the following, or any other number to terminate:");
        System.out.println("1- Years of Experience Report");
        System.out.println("2- Salary Report");
        int choice = inpScanner.nextInt();
        inpScanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                handleHeaderAndFooterChanges(chosenEmp, inpScanner);
                System.out.println("============================================\n");
                System.out.println(chosenEmp.generateYearsOfExperienceReport());
                break;
            case 2:
                handleHeaderAndFooterChanges(chosenEmp, inpScanner);
                System.out.println("============================================\n");
                System.out.println(chosenEmp.generatePayReport());
                break;
            default:
                System.out.println("Program Terminated.");
        }

        inpScanner.close();
    }

    /**
     * Handles the process of changing the header and/or footer of a report.
     */
    private static void handleHeaderAndFooterChanges(Employee chosenEmp, Scanner inpScanner) {
        System.out.println("\nDo you want to change the Header or Footer?");
        System.out.println("1- Change Header");
        System.out.println("2- Change Footer");
        System.out.println("3- Both");
        System.out.println("write any other number if you do not want to make change");
        int changeChoice = inpScanner.nextInt();
        inpScanner.nextLine(); // Consume newline

        switch (changeChoice) {
            case 1:
                System.out.println("Enter the new Header:");
                String newHeader = inpScanner.nextLine();
                chosenEmp.changeHeader(newHeader);
                break;
            case 2:
                System.out.println("Enter the new Footer:");
                String newFooter = inpScanner.nextLine();
                chosenEmp.changeFooter(newFooter);
                break;
            case 3:
                System.out.println("Enter the new Header:");
                newHeader = inpScanner.nextLine();
                System.out.println("Enter the new Footer:");
                newFooter = inpScanner.nextLine();
                chosenEmp.changeHeader(newHeader);
                chosenEmp.changeFooter(newFooter);
                break;
            default:
                System.out.println("No changes made.");
        }
    }
}
