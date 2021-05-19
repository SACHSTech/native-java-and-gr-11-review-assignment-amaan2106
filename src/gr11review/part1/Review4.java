package gr11review.part1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Review4 {

    public static void main(String[] args) {

        double subtotal = 0;

        Scanner scanner = new Scanner(System.in);;
        System.out.println("How many items do you want to buy? ");
        int numberOfItems = scanner.nextInt();

        for(int i = 1; i <= numberOfItems; i++){
            System.out.println("Enter the price for item " +i+ ":");
            double item = scanner.nextDouble();
            subtotal += item;
        }

        System.out.println("Subtotal: $" + new DecimalFormat("0.00").format(subtotal));
        double tax = subtotal * 0.13;
        System.out.println("Tax: $" + new DecimalFormat("0.00").format(tax));
        System.out.println("Total: $" +new DecimalFormat("0.00").format(tax + subtotal)) ;

    }


}