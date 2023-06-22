import java.util.Scanner;

public class MenuDriveExample {
    /*
    Write a program to demonstrate
     */
    public static void main(String[] args) {

        String yesNo = "yes";//init
        while (yesNo.equalsIgnoreCase("Yes")) {
            System.out.println("Do you want to continue : \n1. Yes\n2. No");
            Scanner scanner = new Scanner(System.in);
            yesNo = scanner.next();

            //Read some string or user input from console
            //read-write - input and output
            System.out.println("Please enter an input(day of week) ");//output
            String dayOfWeek = scanner.next();//input

            switch (dayOfWeek) {
                case "Monday":
                    System.out.println("Mondays are boring.");
                    break;
                case "Tuesday":
                    System.out.println("Tuesday Better than Monday");
                    break;
                case "Wednesday":
                    System.out.println("Wednesday is okays.");
                    break;
                case "Thursday":
                    System.out.println("Thursday is a day that I go to office.");
                    break;
                case "Friday":
                    System.out.println("Summer Fridays are half days.");
                    break;
                case "Saturday":
                    System.out.println("First day of weekend.");
                    break;
                case "Sunday":
                    System.out.println("Awesome day.");
                    break;
                default:
                    System.out.println("User has entered invalid input.");
            }

        }
    }
}
