import java.util.Scanner;

public class TipCalculator
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group? ");
        int people = scan.nextInt();

        System.out.print("Enter the tip percentage (0-100) ");
        int tipPercent = scan.nextInt();
        if (tipPercent > 100 || tipPercent < 0)
        {
            System.out.println("Input invalid. Please try again.");
        }

        System.out.println("Enter a cost in dollars and cents (e.g. 9.85), input -1 to end: ");
        double itemCost = scan.nextDouble();
        while (itemCost > -1) {
            double totalCost;
            System.out.print("Enter a cost in dollars and cents (e.g. 9.85), input -1 to end: ");
            double tempItemCost = scan.nextDouble();
            double tempTotalCost = tempItemCost;
            totalCost = tempItemCost + tempTotalCost;
        } else {

        }

    }
}