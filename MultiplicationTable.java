// 8. Print multiplication table for given number.

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        //Created scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = scanner.nextInt();
        System.out.println();

        System.out.println("Multiplication table of number " + n);
        for (int i = 1; i <=10 ; i++) {

            System.out.println(n + " x " + i + " = " + (n*i));
        }
    }
}
