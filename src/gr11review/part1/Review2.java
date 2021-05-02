package gr11review.part1;

import java.util.Scanner;

public class Review2{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("0 - print a joke about your hair");
        System.out.println("1 - print a joke about your feet");
        System.out.println("2 - print a joke about your clothes");
        System.out.println("3 - print a joke about your teacher");


        System.out.println("choose a menu option: ");
        int option = scanner.nextInt();

        switch (option){
            case 0:
                System.out.println("You have sticky hair");
                break;
            case 1:
                System.out.println("You have stinky feet");
                break;
            case 2:
                System.out.println("You have weird clothes");
                break;
            case 3:
                System.out.println("You have a loud teacher");
            default:
                System.out.println("Invalid menu option");
        }

    }
    }