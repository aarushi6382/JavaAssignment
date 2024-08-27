package Array;

import java.util.Scanner;

public class cost_calculation {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] titles = new String[10];
        String[] authors = new String[10];
        String[] prices = new String[10];
        String[] publishers = new String[10];
        String[] isbns = new String[10];

        double totalCost = 0;
        double maxCost = Double.MIN_VALUE;
        double minCost = Double.MAX_VALUE;

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

            // Convert the price to a double and update calculations
            double price = Double.parseDouble(prices[i].replace("£", ""));
            totalCost += price;
            if (price > maxCost) {
                maxCost = price;
            }
            if (price < minCost) {
                minCost = price;
            }
        }

        System.out.println("\nTitle      Author          Price    Publisher    ISBN");
        System.out.println("====       ========        =====    ========     =====");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10s %-15s %-8s %-12s %-13s%n", 
                titles[i], authors[i], prices[i], publishers[i], isbns[i]);
                
        }

        
        double averageCost = totalCost / 10;

        System.out.println("\nReport:");
        System.out.println("Total number of books: " + 10);
        System.out.println("Total cost of books: £" + totalCost);
        System.out.println("Maximum cost of a book: £" + maxCost);
        System.out.println("Minimum cost of a book: £" + minCost);
        System.out.println("Average cost of a book: £" + averageCost);

        scanner.close();
    }
}
