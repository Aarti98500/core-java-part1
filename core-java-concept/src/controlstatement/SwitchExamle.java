package controlstatement;

import java.util.Scanner;

/**
 * This class demonstrate the use of control statements
 */

/*
    This is multiline comment
    A new line comment for testing
 */

public class SwitchExamle {
     public static void main(String[] args) {
        System.out.println("Please enter a string : ");
        //user input
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println("User has entered : "+input);
    }
}
