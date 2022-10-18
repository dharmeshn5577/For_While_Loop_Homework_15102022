// 9. Enter any String and count total numbers of 'a' in that String.

import java.util.Scanner;

public class CountCharacterFromString {

    public static void main(String[] args) {
        //Created scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String yourString = scanner.next();
        System.out.println();

        char aCharacterSmall = 'a';
        int count = 0;  // created int count to count number of 'a' and assign value 0
        for (int i = 0; i < yourString.length(); i++) {

            // used charAt() function to find out index number of character
            if (yourString.charAt(i)==aCharacterSmall)
            count++;    // used ++ for count increment by 1
        }
        System.out.println("Total number of character '" + aCharacterSmall +"' in that string is : " + count);
        }

}
