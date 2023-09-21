import java.util.Scanner;

public class TipCalculator
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Goodday, user.");
        System.out.print("How many people are in your group? ");
        int people = scan.nextInt();

        System.out.print("Enter the tip percentage (0-100) ");
        int tipPercent = scan.nextInt();
        if (tipPercent > 100)
        {
            System.out.println("Input invalid. Please try again.");
        }


    }

}