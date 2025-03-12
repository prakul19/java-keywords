import java.util.Scanner;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input details for first patient
        System.out.print("Enter Patient ID for first patient: ");
        int patientID1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Name for first patient: ");
        String name1 = scanner.nextLine();

        System.out.print("Enter Age for first patient: ");
        int age1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Ailment for first patient: ");
        String ailment1 = scanner.nextLine();

        Patient patient1 = new Patient(patientID1, name1, age1, ailment1);

        // Input details for second patient
        System.out.print("Enter Patient ID for second patient: ");
        int patientID2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Name for second patient: ");
        String name2 = scanner.nextLine();

        System.out.print("Enter Age for second patient: ");
        int age2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Ailment for second patient: ");
        String ailment2 = scanner.nextLine();

        Patient patient2 = new Patient(patientID2, name2, age2, ailment2);

        // Display patient details
        patient1.displayPatientDetails();
        System.out.println();
        patient2.displayPatientDetails();

        // Display total patients admitted
        Patient.getTotalPatients();

        scanner.close();
    }
}

class Patient {
    private static String hospitalName = "City Hospital"; // Static variable shared across all patients
    private static int totalPatients = 0; // Static counter for total patients
    private final int patientID; // Final variable (Unique ID for each patient)
    private String name;
    private int age;
    private String ailment;

    // Constructor using 'this' to resolve ambiguity
    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++; // Increment patient count
    }

    // Method to display patient details
    public void displayPatientDetails() {
        if (this instanceof Patient) { // Using instanceof
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        }
    }

    // Static method to display total number of patients
    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }
}

/*
Input:
Enter Patient ID for first patient: 101
Enter Name for first patient: Aman
Enter Age for first patient: 22
Enter Ailment for first patient: Fever
Enter Patient ID for second patient: 102
Enter Name for second patient: Adarsh
Enter Age for second patient: 23
Enter Ailment for second patient: Cold

Output:
Hospital Name: City Hospital
Patient ID: 101
Name: Aman
Age: 22
Ailment: Fever

Hospital Name: City Hospital
Patient ID: 102
Name: Adarsh
Age: 23
Ailment: Cold

Total Patients Admitted: 2
*/
