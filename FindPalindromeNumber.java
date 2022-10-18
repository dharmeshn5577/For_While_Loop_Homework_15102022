// 12. Input any number and check if its Palindrome or not?
// Palindrome number is when we reverse the number it should be same eg. 12321 is a Palindrome number

import java.util.Scanner;

public class FindPalindromeNumber {

    public static void main(String[] args) {
        //Created scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = scanner.nextInt();
        int reverseNumber = 0;
        int remainder;
        int n1 = n;

        while (n1 > 0) {
            remainder = n1 % 10;
            reverseNumber = (reverseNumber * 10) + remainder; // find reverse number
            n1 = n1 / 10;
        }
        if (n == reverseNumber)    // compare given number n with reversed number
            System.out.println("The given number " + n + " is Palindrome Number.");
        else
            System.out.println("The given number " + n + " is not Palindrome Number.");

    }

}



