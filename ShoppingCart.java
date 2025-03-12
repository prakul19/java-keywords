import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input details for first product
        System.out.print("Enter Product ID for first product: ");
        int productID1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Product Name for first product: ");
        String productName1 = scanner.nextLine();

        System.out.print("Enter Price for first product: ");
        double price1 = scanner.nextDouble();

        System.out.print("Enter Quantity for first product: ");
        int quantity1 = scanner.nextInt();
        scanner.nextLine();

        Product prod1 = new Product(productID1, productName1, price1, quantity1);

        // Input details for second product
        System.out.print("Enter Product ID for second product: ");
        int productID2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Product Name for second product: ");
        String productName2 = scanner.nextLine();

        System.out.print("Enter Price for second product: ");
        double price2 = scanner.nextDouble();

        System.out.print("Enter Quantity for second product: ");
        int quantity2 = scanner.nextInt();

        Product prod2 = new Product(productID2, productName2, price2, quantity2);

        // Display product details
        prod1.displayProductDetails();
        prod2.displayProductDetails();

        Product.updateDiscount(15);
        System.out.println("New Discount Updated!");

        scanner.close();
    }
}

class Product {
    private static double discount = 10.0; // Static discount shared by all products
    private final int productID; // Final variable
    private String productName;
    private double price;
    private int quantity;

    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayProductDetails() {
        if (this instanceof Product) { // Using instanceof
            System.out.println("Product ID: " + productID);
            System.out.println("Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        }
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }
}

/*
Input:
Enter Product ID for first product: 101
Enter Product Name for first product: Laptop
Enter Price for first product: 1200
Enter Quantity for first product: 2
Enter Product ID for second product: 102
Enter Product Name for second product: Smartphone
Enter Price for second product: 800
Enter Quantity for second product: 5

Output:
Product ID: 101
Name: Laptop
Price: $1200.0
Quantity: 2
Discount: 10.0%
Product ID: 102
Name: Smartphone
Price: $800.0
Quantity: 5
Discount: 10.0%
New Discount Updated!
*/
