// 7. Print the numbers from given range which can be divided by 3 and 5 separately.

import java.util.Scanner;

public class DisplayNumbersDividedBySpecificNumber {

    public static void main(String[] args) {
        //Created scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Numbers Range");

        System.out.print("From : ");
        int n = scanner.nextInt();

        System.out.print("To : ");
        int m = scanner.nextInt();

        System.out.println();
        System.out.print("Numbers divide by 3 between " + n + " to " + m + " is = ");
        for (int i = n; i <= m; i++) {
            // if number divided by n number and remainder is 0 then that number is divided by n number
            if (i % 3 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
        System.out.print("Numbers divide by 5 between " + n + " to " + m + " is = ");
        for (int i = n; i <= m; i++) {
            if (i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
    }
}
