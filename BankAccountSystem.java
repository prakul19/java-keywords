import java.util.Scanner;

public class BankAccountSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input details for first account
        System.out.print("Enter Account Number for first account: ");
        int accNumber1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Account Holder Name for first account: ");
        String accHolder1 = scanner.nextLine();

        System.out.print("Enter Balance for first account: ");
        double balance1 = scanner.nextDouble();
        scanner.nextLine();

        BankAccount acc1 = new BankAccount(accNumber1, accHolder1, balance1);

        // Input details for second account
        System.out.print("Enter Account Number for second account: ");
        int accNumber2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Account Holder Name for second account: ");
        String accHolder2 = scanner.nextLine();

        System.out.print("Enter Balance for second account: ");
        double balance2 = scanner.nextDouble();

        BankAccount acc2 = new BankAccount(accNumber2, accHolder2, balance2);

        // Display account details
        acc1.displayAccountDetails();
        acc2.displayAccountDetails();

        BankAccount.getTotalAccounts();

        scanner.close();
    }
}

class BankAccount {
    private static String bankName = "Central Bank"; // Static variable shared across all accounts
    private static int totalAccounts = 0; // Static counter for total accounts
    private final int accountNumber; // Final variable that cannot be changed
    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccounts++; // Increment total accounts
    }

    public void displayAccountDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + balance);
    }

    public static void getTotalAccounts() {
        System.out.println("Total Bank Accounts: " + totalAccounts);
    }
}

/*
Input:
Enter Account Number for first account: 101
Enter Account Holder Name for first account: Aman
Enter Balance for first account: 500000
Enter Account Number for second account: 102
Enter Account Holder Name for second account: Adarsh
Enter Balance for second account: 300000

Output:
Bank Name: Central Bank
Account Number: 101
Account Holder: Aman
Balance: $500000.0
Bank Name: Central Bank
Account Number: 102
Account Holder: Adarsh
Balance: $300000.0
Total Bank Accounts: 2
*/
