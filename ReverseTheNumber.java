// 4. Input the 5 digits number and then reverse it.

import java.util.Scanner;

public class ReverseTheNumber {

    public static void main(String[] args) {
        //Created scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = scanner.nextInt();   // eg number = 12
        int reverseNumber = 0;
        int remainder;

        // not needed so not mentioned the first part of the for loop condition
        for (; n != 0; n=n/10) {

            remainder = n%10;       // 12/10 remainder is 2
            reverseNumber = (reverseNumber * 10) + remainder;   // 0*10 + 2 = 0+2 = 2 and then repeat
        }

        System.out.println("The reverse number of the given number is : " + reverseNumber);
    }
}
