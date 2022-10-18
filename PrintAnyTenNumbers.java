// 1. Print any 10 numbers between given/user input range.

import java.util.Scanner;

public class PrintAnyTenNumbers {

    public static void main(String[] args) {

        //Created scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        int n = scanner.nextInt();
        System.out.print("Enter the Last Number: ");
        int m = scanner.nextInt();
        System.out.println("List of numbers as per your input range :");

        for (int i = n; i <=m; i++) {   // Used for loop function
            System.out.print(i + ", ");
        }
    }
}
