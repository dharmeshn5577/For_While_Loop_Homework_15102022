// 5. Find a factorial for given number.
// Factorial number eg. 5! = 1 * 2 * 3 * 4 * 5 = 120

import java.util.Scanner;

public class FactorialValue {

    public static void main(String[] args) {
        //Created scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = scanner.nextInt();

        // created int factorial value and assign value 1, because we are going to use multiplication operator
        int factorialValue = 1;

        for (int i = 1; i <=n ; i++) {

            factorialValue = factorialValue * i;
            // when i=1 -> 1*1 = 1, now i++ so i=2 -> 1*2=2, now i++ so i=3 -> 2*3= 6....so on

        }
        System.out.println("The factorial value of number " + n + " is " + factorialValue);
    }
}
