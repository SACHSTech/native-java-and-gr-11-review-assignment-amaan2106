package gr11review.part1;

import java.util.Scanner;

public class Review5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the yearly invested amount: ");
        double yearly_amount = scanner.nextDouble();

        System.out.println("Enter the compound interest rate: ");
        double compound_interest_rate = scanner.nextDouble();

        System.out.println("Enter the target amount: " );
        double targetAmount = scanner.nextDouble();


        double TotalAmount = 0;
        int year = 0;


        while (targetAmount > TotalAmount){
            TotalAmount += yearly_amount;
            TotalAmount += (TotalAmount * (compound_interest_rate/100));
            year++;
        }

        System.out.println("The target amount will be earned in " +year+ " years.");


    }

    }