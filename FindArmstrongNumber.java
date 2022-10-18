// 13. Input any number and find out if its Armstrong number or not?

import java.util.Scanner;

public class FindArmstrongNumber {

    public static void main(String[] args) {
        //Created scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = scanner.nextInt();
        int digitLength = 0;
        int remainder = 0;

        int n1 = n; // we are using n value in 2 different condition so created new int n1=n
        while (n1 > 0) {
            remainder = n1 % 10; // to separate last digit from given number use modulus operator with 10

            digitLength++;
            // to find length of digit by using increment operator, and we use it to find the power of digit

            n1 = n1 / 10;
        }
//        System.out.println("Given number length is : " + digitLength);

        int n2 = n;  // for this condition created new int n2=n

        // to find final answer with addition operator created int armstrong and assign value 0
        int armstrong = 0;

        while (n2 > 0) {
            // to find power of digit with multiplication operator created int multiply and assign value 1
            int multiply = 1;

            remainder = n2 % 10;

            // use for loop condition to find power of digit with condition <= Digit Length
            for (int i = 1; i <= digitLength; i++) {
                multiply = multiply * remainder;
            }
            armstrong = armstrong + multiply;
            n2 = n2 / 10;
        }

        if (armstrong == n) {           // compare the final armstrong answer with input n
            System.out.println("The given number " + n + " is an Armstrong Number.");

        } else {
            System.out.println("The given number " + n + " is not an Armstrong Number.");

        }
    }
}
