package gr11review.part1;

import java.util.Scanner;

public class Review7 {

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        String theSentence = scanner.nextLine();

        int CharacterCount = 0;
        int SpaceCount = 0;
        int aCount = 0;

        for(int i = 0; i < theSentence.length(); i++){
                CharacterCount++;
        }
        for (int i = 0; i < theSentence.length(); i++){
            if(theSentence.charAt(i) == ' '){
                SpaceCount++;
            }
        }
        for (int i = 0; i < theSentence.length(); i++){
            if(theSentence.charAt(i) == 'a'){
                aCount++;
            }
        }


        System.out.println("There are "+CharacterCount+ " characters in the sentence.");
        System.out.println("There are "+SpaceCount+ " spaces in the sentence.");
        System.out.println("There are "+aCount+ " letter a in the sentence.");
        for (int i = 0; i < theSentence.length(); i= i+2){
            System.out.print(theSentence.charAt(i));
        }



    }
}