import java.util.Scanner;

public class VehicleSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input details for first vehicle
        System.out.print("Enter Registration Number for first vehicle: ");
        String registrationNumber1 = scanner.nextLine();

        System.out.print("Enter Owner Name for first vehicle: ");
        String ownerName1 = scanner.nextLine();

        System.out.print("Enter Vehicle Type for first vehicle: ");
        String vehicleType1 = scanner.nextLine();

        Vehicle vehicle1 = new Vehicle(registrationNumber1, ownerName1, vehicleType1);

        // Input details for second vehicle
        System.out.print("Enter Registration Number for second vehicle: ");
        String registrationNumber2 = scanner.nextLine();

        System.out.print("Enter Owner Name for second vehicle: ");
        String ownerName2 = scanner.nextLine();

        System.out.print("Enter Vehicle Type for second vehicle: ");
        String vehicleType2 = scanner.nextLine();

        Vehicle vehicle2 = new Vehicle(registrationNumber2, ownerName2, vehicleType2);

        // Display vehicle details
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();

        scanner.close();
    }
}

class Vehicle {
    private static double registrationFee = 500; // Static variable
    private final String registrationNumber; // Final variable
    private String ownerName;
    private String vehicleType;

    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        if (this instanceof Vehicle) { // Using instanceof
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Fee: Rs." + registrationFee);
        }
    }
}

/*
Input:
Enter Registration Number for first vehicle: XYZ123
Enter Owner Name for first vehicle: Aman
Enter Vehicle Type for first vehicle: Car
Enter Registration Number for second vehicle: ABC789
Enter Owner Name for second vehicle: Raj
Enter Vehicle Type for second vehicle: Motorcycle

Output:
Registration Number: XYZ123
Owner Name: Aman
Vehicle Type: Car
Registration Fee: Rs.500.0
Registration Number: ABC789
Owner Name: Raj
Vehicle Type: Motorcycle
Registration Fee: Rs.500.0
*/
