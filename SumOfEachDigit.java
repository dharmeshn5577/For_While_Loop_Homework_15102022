// 10. Input any five digits number and then find sum of each digit.

import java.util.Scanner;

public class SumOfEachDigit {


    public static void main(String[] args) {
        //Created scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = scanner.nextInt();
        int sum = 0;
        int remainder = 0;

        // not needed so not mentioned the first part of the for loop condition
        for (; n != 0; n=n/10) {

            remainder = n%10;

            sum = sum + remainder;

        }

        System.out.println("The sum of each digit of the given number is : " + sum);
    }
}
