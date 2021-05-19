package gr11review.part1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Review6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the price for an item: ");
        double amount = scanner.nextDouble();
        double totalAmount =0;
        totalAmount += amount;



        while (amount != 0){
            System.out.println("Enter the price for an item: ");
            amount = scanner.nextDouble();
            totalAmount += amount;
            
        }
        double subtotal = 0;
        subtotal += totalAmount;
        double tax = subtotal * 0.13;
        System.out.println("Subtotal: $" +new DecimalFormat("0.00").format(subtotal));
        System.out.println("Tax: $" +new DecimalFormat("0.00").format(tax));
        System.out.println("Total: $" +new DecimalFormat("0.00").format(tax + subtotal)) ;



    }
    }