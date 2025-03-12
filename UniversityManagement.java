import java.util.Scanner;

public class UniversityManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input details for first student
        System.out.print("Enter Roll Number for first student: ");
        int rollNumber1 = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Name for first student: ");
        String name1 = scanner.nextLine();

        System.out.print("Enter Grade for first student: ");
        String grade1 = scanner.nextLine();

        Student stu1 = new Student(rollNumber1, name1, grade1);

        // Input details for second student
        System.out.print("Enter Roll Number for second student: ");
        int rollNumber2 = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Name for second student: ");
        String name2 = scanner.nextLine();

        System.out.print("Enter Grade for second student: ");
        String grade2 = scanner.nextLine();

        Student stu2 = new Student(rollNumber2, name2, grade2);

        // Display student details
        stu1.displayStudentDetails();
        stu2.displayStudentDetails();

        scanner.close();
    }
}

class Student {
    private static String universityName = "RGPV University"; // Static variable
    private final int rollNumber; // Final variable
    private String name;
    private String grade;

    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
    }

    public void displayStudentDetails() {
        if (this instanceof Student) { // Using instanceof
            System.out.println("University: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        }
    }
}

/*
Input:
Enter Roll Number for first student: 101
Enter Name for first student: Aman
Enter Grade for first student: A
Enter Roll Number for second student: 102
Enter Name for second student: Adarsh
Enter Grade for second student: B

Output:
University: RGPV University
Roll Number: 101
Name: Aman
Grade: A
University: RGPV University
Roll Number: 102
Name: Adarsh
Grade: B
*/
