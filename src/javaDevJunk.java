/*
* Just a bunch of junk - stuff learned in Java
* Created 02/08/2022
*
*/

import java.io.InputStream;
import java.util.Scanner; // in order to read user-input we need to import the scanner library

public class javaDevJunk {
    public static void main() {
        // this statement initialized the scanner util to the 'scanner' var
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:"); // display text to user
        // declare a variable to capture input from the user
        // we set the userText var equal to the nextLine() method of the scanner util
        String userText = scanner.nextLine();
        System.out.println("You typed: "+userText); // display string literal concatenated with userText
    }
}
