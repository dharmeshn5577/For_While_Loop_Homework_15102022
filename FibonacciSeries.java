// 2. Print the sequence for fibonacci series for given limitation n
// Fibonacci series = 0,1,1,2,3,5,8,13...next number is sum of 2 preceding numbers

import java.util.Scanner;

public class FibonacciSeries {

    static int firstNumber = 0;
    static int secondNumber = 1;
    static int nextNumber;

    public static void main(String[] args) {
        //Created scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number till you want to print fibonacci series: ");
        int n = scanner.nextInt();
        System.out.println();
        System.out.println("Fibonacci series till number " + n + " : ");
        for (int i = secondNumber; i <=n; i++) {
            System.out.print(firstNumber + ", ");

            nextNumber = firstNumber + secondNumber; // calculated next number
           firstNumber = secondNumber;
           secondNumber = nextNumber;
        }

    }
}
