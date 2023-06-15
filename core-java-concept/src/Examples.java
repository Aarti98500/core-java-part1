import java.util.Date;

/*
    1. Variables - store a value, and it can change in the program
    2. constants - value of constants doesn't change in the program -> final
    3. conditional statement - if and if else
    4. control statement - switches
    5. loops
 */
public class Examples {
    public static void main(String[] args) {
        int salary;
        int age = 25;
        salary = 35000;
        System.out.println("salary : " + salary + " age : " + age);


        if (salary > 50000){
            System.out.println("Your salary is more than 50k");
            if (age > 18){
                System.out.println("Your eligible for voting...");
            } else {
                System.out.println("Your under 18 and cannot vote...");
            }

        } else if (salary > 40000){
            System.out.println("Your salary is more than 40k");
            if (age > 18){
                System.out.println("Your eligible for voting...");
            } else {
                System.out.println("Your under 18 and cannot vote...");
            }

        } else if (salary > 30000){
            System.out.println("Your salary is greater than 30k");
            if (age > 18){
                System.out.println("Your eligible for voting...");
            }else {
                System.out.println("Your under 18 and not eligible for voting...");
            }
        } else {
            System.out.println("Your salary is less than 50k");
        }

        final String dob = "20/09/2001"; // this "20/09/2001" is called String literal and creates String object
        //here dob is a constant be reassigned.
        System.out.println("Date of Birth : " + dob);
        //dob = "21/09/2001";


    }
}
