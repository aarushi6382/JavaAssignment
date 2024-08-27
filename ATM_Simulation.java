package Array;

import java.util.Scanner;


public class ATM_Simulation {
	
	    static int correctPin = 1234; 
	    static double balance = 50000.00;

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        boolean isAuthenticated = false;
	        int attempts = 0;

	        // User Authentication
	        while (!isAuthenticated && attempts < 3) {
	            System.out.print("Enter your 4 digit : ");
	            int enteredPin = scanner.nextInt();

	            if (enteredPin == correctPin) {
	                isAuthenticated = true;
	                System.out.println("Access granted.");
	            } else {
	                attempts++;
	                System.out.println("Incorrect PIN. Try again.");
	            }

	            if (attempts == 3 && !isAuthenticated) {
	                System.out.println("Three incorrect PIN attempts. Your account has been locked.");
	                return;
	            }
	        }

	        // Main menu
	        while (isAuthenticated) {
	            System.out.println("\nATM  Menu:");
	            System.out.println("1. Balance Inquiry");
	            System.out.println("2. Cash Withdrawal");
	            System.out.println("3. Fund Transfer");
	            System.out.println("4. Exit");
	            System.out.print("Choose an option: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    // Balance Inquiry
	                    System.out.println("Your current balance is: Rs." + balance);
	                    printResult(scanner);
	                    break;
	                    
	                case 2:
	                    // Cash Withdrawal
	                    System.out.print("Enter the amount to withdraw: Rs");
	                    double withdrawAmount = scanner.nextDouble();

	                    if (withdrawAmount <= balance) {
	                        balance -= withdrawAmount;
	                        System.out.println("Please take your cash. Your new balance is: Rs" + balance);
	                    } else {
	                        System.out.println("Insufficient balance.");
	                    }
	                    printResult(scanner);
	                    break;
	                    
	                case 3:
	                    // Fund Transfer
	                    System.out.print("Enter the account number for fund transfer: ");
	                    int accountNumber = scanner.nextInt();

	                    System.out.print("Enter the amount to transfer: Rs");
	                    double transferAmount = scanner.nextDouble();

	                    if (transferAmount <= balance) {
	                        balance -= transferAmount;
	                        System.out.println("Transfer successful. Your new balance is: Rs" + balance);
	                    } else {
	                        System.out.println("Insufficient funds.");
	                    }
	                    printResult(scanner);
	                    break;
	                    
	                case 4:
	                    // Exit
	                    System.out.println("Thank you for using the ATM.");
	                    isAuthenticated = false;
	                    break;
	                    
	                default:
	                    System.out.println("Invalid option.");
	                    break;
	            }
	        }

	        scanner.close();
	    }

	    // Method to offer a receipt print option
	    public static void printResult(Scanner scanner) {
	    
	        String result = scanner.next();
	      
	    }
}


	
	  
