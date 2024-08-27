package Array;
import java.util.Scanner;
public class book_details {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        String[] titles = new String[10];
	        String[] authors = new String[10];
	        String[] prices = new String[10];
	        String[] publishers = new String[10];
	        String[] isbns = new String[10];


	        for (int i = 0; i < 10; i++) {
	            System.out.println("Enter details for book " + (i + 1) + ":");
	            System.out.print("Title: ");
	            titles[i] = scanner.nextLine();
	            System.out.print("Author: ");
	            authors[i] = scanner.nextLine();
	            System.out.print("Price: ");
	            prices[i] = scanner.nextLine();
	            System.out.print("Publisher: ");
	            publishers[i] = scanner.nextLine();
	            System.out.print("ISBN: ");
	            isbns[i] = scanner.nextLine();
	        }

	        System.out.println("\nTitle      Author          Price    Publisher    ISBN");
	        System.out.println("====       ========        =====    ========     =====");

	        for (int i = 0; i < 10; i++) {
	        	System.out.printf("%-10s %-15s %-8s %-12s %-13s%n", titles[i], authors[i], prices[i], publishers[i], isbns[i]);
	        }

	        scanner.close();
	    }
	}

