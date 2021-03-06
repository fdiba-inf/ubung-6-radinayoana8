package exercise6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input. nextInt();
         //242
        //2
        //2 * 10 + 4
        //24 * 10 + 2
        //242

        int reversedNumber = 0;
        int manipulatedNumber = number;
        while ( manipulatedNumber > 0){
          int nextDigit = manipulatedNumber % 10;
          reversedNumber = reversedNumber * 10 + nextDigit; 
          manipulatedNumber = manipulatedNumber / 10; 
          }

        boolean palindrome = number == reversedNumber;
        System.out.print("Palindrome: " + palindrome);
    }
}
    

   
    