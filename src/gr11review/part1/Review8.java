package gr11review.part1;

public class Review8 {

    public static void main(String[] args) {

        int MaxNumber = 8;
        int MinNumber = 1;
        int Range = MaxNumber - Min + 1;
        int pick1;
        int pick2;
        int pick3;
        int tripleNumbers = 0;


        for (int i =0; i < 1000; i ++){

            pick1 = (int) (Math.random() * Range) + MinNumber;
            pick2 = (int) (Math.random() * Range) + MinNumber;
            pick3 = (int) (Math.random() * Range) + MinNumber;
            System.out.print(pick1 +" ");
            System.out.print(pick2 +" ");
            System.out.println(pick3);
            if(pick1 == pick2 && pick1 == pick3){
                tripleNumbers ++;

            }

        }

        System.out.println(tripleNumbers);




    }
}