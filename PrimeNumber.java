// 3. Check if given number is Prime number or not?
// Prime is number which is divide by 1 and number itself, and it should be natural number
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        //Created scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = scanner.nextInt();
        int count = 0;  // created int count to find number can be divided by how many numbers

        if (n > 1) {    // Prime number should be greater than 1
            for (int i = 1; i <= n; i++) {

                if (n % i == 0) {
                    count++;    // to find total count used incremental operator
                }
            }
            if (count == 2) {   // for Prime number count should be 2 if  condition true it's prime number
                System.out.println("Number " + n + " is a Prime Number.");
            } else {                            // if condition false it's not a prime number
                System.out.println("Number " + n + " is a not Prime Number.");
                    }
        } else {
            System.out.println("Number " + n + " is not a Prime Number.");
        }
    }
}