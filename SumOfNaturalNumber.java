// 6. Display sum of n Natural number.

import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        //Created scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i <=n ; i++) {

            sum = sum + i;
            // when i=1 -> 0+1 = 1, now i++ so i=2 -> 1+2=3, now i++ so i=3 -> 3+3= 6....so on

        }
        System.out.println("The sum of given Natural Number is : " + sum);
    }
}
