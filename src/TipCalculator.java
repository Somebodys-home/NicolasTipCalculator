import java.util.Objects;
import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCalculator
{
    public static void main(String [] args) {

        double billB4Tip = 0;
        int people = 0;

        DecimalFormat df_obj = new DecimalFormat("0.00"); // shoutout to isfar for helping me with this <3
        Scanner scan = new Scanner(System.in);

        // Juan
        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group? ");
        people = scan.nextInt();
        System.out.print("Enter the tip percentage (0-100) ");
        double tipnumber = scan.nextDouble();
        double tipercent = (double) tipnumber / 100;
        if (tipercent > 100 || tipercent < 0) {
            System.out.println("Input invalid. Please try again.");
        }

        // Mr. Crabs
        boolean end = false;
        while (!end) {
            System.out.print("Enter a cost in dollars and cents (e.g. 9.85), input -1 to end: ");
            double itemCost = scan.nextDouble();
            scan.nextLine();
            if (itemCost >= 0) {
                billB4Tip += itemCost;
            } else {
                end = true;
            }
        }
        System.out.println("---------------------------");

        // Tom Nook
        double totalTip = billB4Tip * tipercent;
        double billWithTip = billB4Tip + totalTip;
        double perPersonBillB4tip = billB4Tip / people;
        double tipPerPerson = totalTip / people;
        double totalCostPPerson = billWithTip / people;
        double fakeTotalCost = totalCostPPerson * 1.05;

        System.out.println("Total bill before tip: $" + df_obj.format(billB4Tip));
        System.out.println("Tip percentage: " + df_obj.format(tipnumber) + "%");
        System.out.println("Total tip: $" + df_obj.format(totalTip));
        System.out.println("Total bill with tip: $" + df_obj.format(billWithTip));
        System.out.println("Per person cost (before tip): $" + df_obj.format(perPersonBillB4tip));
        System.out.println("Tip per person: $" + df_obj.format(tipPerPerson));
        System.out.println("Total cost per person : $" + df_obj.format(fakeTotalCost));

        System.out.println ("Is this the correct amount owed (yes / no)? ");
        String getScammed = scan.nextLine();
        if (getScammed.equals("yes")) {
            System.out.println("Ok, have a nice day.");
        } else {
            System.out.println("I know. I charged an extra 5% to fund sarcoma research.");
            System.out.println("I don't care if I don't have your consent, it's for a good cause.");
            System.out.println("Have a nice day. Unless you don't support this, in which case I hope you go to prison for life without parole.");
        }



    }
}