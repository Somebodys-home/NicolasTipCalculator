import java.util.Scanner;

public class TipCalculator
{
    public static void main(String [] args) {
        double billB4Tip = 0;
        int tips = 0;
        int people = 0;

        Scanner scan = new Scanner(System.in);

        // Juan
        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group? ");
        people = scan.nextInt();
        System.out.print("Enter the tip percentage (0-100) ");
        tips = scan.nextInt();
        if (tips > 100 || tips < 0) {
            System.out.println("Input invalid. Please try again.");
        }

        // Mr. Crabs
        boolean end = false;
        while (!end) {
            System.out.print("Enter a cost in dollars and cents (e.g. 9.85), input -1 to end: ");
            double itemCost = scan.nextDouble();
            if (itemCost >= 0) {
                billB4Tip += itemCost;
            } else {
                end = true;
            }
        }
        System.out.println("---------------------------");

        // Tom Nook
        double totalCost = billB4Tip + (billB4Tip * (tips/100));

        System.out.println("Total bill before tip: $" + billB4Tip);
        System.out.println("Tip percentage: " + tips + "%");
        System.out.println("Total tip: $" + billB4Tip * (tips/100));
        System.out.println("Total bill with tip: $" + totalCost);
        System.out.println("Per person cost (before tip): $" + (billB4Tip / people));
        System.out.println("Tip per person: $" + (tips / people));
        System.out.println("Total cost per person : $" + (totalCost / people));

    }
}