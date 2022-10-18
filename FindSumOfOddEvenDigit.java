// 11. Input any 5 digits number and then count total number of odd and even digit and find out sum of them

import java.util.Scanner;

public class FindSumOfOddEvenDigit {

    public static void main(String[] args) {
        //Created scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = scanner.nextInt();
        int evenSum = 0;
        int oddSum = 0;
        int evenCount = 0;
        int oddCount = 0;
        int remainder = 0;

        while (n>0) {
            remainder = n % 10; // to separate last digit from given number use modulus operator with 10

            if (n % 2 == 0) {       // if number/2 and remainder is 0 then number is even number

                evenCount++; // to find count of even digit use increment operator
                evenSum = evenSum + remainder;      // to find sum of even digit use addition
            } else {
                oddCount++;
                oddSum = oddSum + remainder;
            }
            n = n / 10;
        }
                System.out.println("The count of EVEN digits in the given number is " + evenCount + " and the sum of EVEN digits is = " + evenSum);

                System.out.println("The count of ODD digits in the given number is " + oddCount + " and the sum of ODD digits is = " + oddSum);
        }
    }

