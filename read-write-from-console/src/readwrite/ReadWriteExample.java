package readwrite;

import java.util.Scanner;

public class ReadWriteExample {
    public static void main(String[] args) {
        System.out.println("Hello please enter an input string : ");//write
        Scanner scanner = new Scanner(System.in);//Scanner for scanning console

        String input = scanner.nextLine();//Read line
        System.out.println(input);//write
        scanner.close();
    }
}
