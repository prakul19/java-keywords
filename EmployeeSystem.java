import java.util.Scanner;

public class EmployeeSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input details for first employee
        System.out.print("Enter Employee ID for first employee: ");
        int id1 = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Name for first employee: ");
        String name1 = scanner.nextLine();

        System.out.print("Enter Designation for first employee: ");
        String designation1 = scanner.nextLine();

        Employee emp1 = new Employee(id1, name1, designation1);

        // Input details for second employee
        System.out.print("Enter Employee ID for second employee: ");
        int id2 = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Name for second employee: ");
        String name2 = scanner.nextLine();

        System.out.print("Enter Designation for second employee: ");
        String designation2 = scanner.nextLine();

        Employee emp2 = new Employee(id2, name2, designation2);

        // Display employee details
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();

        Employee.displayTotalEmployees();

        scanner.close();
    }
}

class Employee {
    private static String companyName = "Tech Corp"; // Static variable
    private static int totalEmployees = 0; // Static counter
    private final int id; // Final variable
    private String name;
    private String designation;

    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    public void displayEmployeeDetails() {
        if (this instanceof Employee) { // Using instanceof
            System.out.println("Company: " + companyName);
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
        }
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
}

/*
Input:
Enter Employee ID for first employee: 1
Enter Name for first employee: Aman
Enter Designation for first employee: Software Engineer
Enter Employee ID for second employee: 2
Enter Name for second employee: Adarsh
Enter Designation for second employee: Manager

Output:
Company: Tech Corp
ID: 1
Name: Aman
Designation: Software Engineer
Company: Tech Corp
ID: 2
Name: Adarsh
Designation: Manager
Total Employees: 2
*/
