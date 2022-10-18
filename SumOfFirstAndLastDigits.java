// 14. Input any five digits number and then find sum of first and last digit

import java.util.Scanner;

public class SumOfFirstAndLastDigits {

    public static void main(String[] args) {
        //Created scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = scanner.nextInt();

        int lastDigit = n % 10;    // finding the last digit

        int firstDigit = 0;

        if (n > 0) {
            while (n > 0) {
                firstDigit = n % 10;
                if ((n / 10) == 0) {   //condition for finding the first digit
                }
                n = n / 10;
            }
            System.out.println("The sum of First and Last digits is = " + (firstDigit + lastDigit));

        } else {
            System.out.println("Invalid input, please enter positive number input");
        }
    }
}
