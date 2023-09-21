import java.util.Scanner;
import java.util.ArrayList;

public class TipCalculator {
    public static void main(String[] args){
        System.out.println("Welcome to the tip calculator!");

        System.out.println("How many people are in your group: ");
        int peopleInGroup = scan.nextInt();

        System.out.println("What's the tip percentage? (0-100): ");
        int tipPercentage = scan.nextInt();

        double cost;
        double itemCost;

        ArrayList<String> items = new ArrayList<String>();
        while (cost != -1.00){
            System.out.println("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            itemCost = scan.nextDouble();
            cost += itemCost;
            System.out.println("Enter the item: ");
            String item = scan.nextLine();
            items.add(item);
        }
    }
}
