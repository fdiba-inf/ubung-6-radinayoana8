package exercise6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input. nextInt();
        int k = 242;
        int reversedNumber = 0;

         while (k > 0)
        {
          int nextDigit = k % 10;
          reversedNumber = reversedNumber * 10 + nextDigit; 
          k = k / 10; 
        }
         boolean palindrome = k == reversedNumber;
        System.out.print("Palindrome: " + palindrome);
    }
}


    

   
    