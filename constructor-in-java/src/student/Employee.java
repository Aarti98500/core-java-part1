package student;

public class Employee {

    //attributes or fields
    String name;
    int id;
    String address;
    long phoneNo;
    int salary;
    String gender;
    String company;
    //Constructors - Constructors the objects, basically initializes object.
    /*
    1. Constructors Name must be same as class name
    2. Constructors does not have any return type
    3. Constructors doesn't return any value
     */

    //no argument constructor

    Employee(){
        System.out.println("*********************");
        System.out.println("no arg constructor called");
        this.name = "Aarti";
        this.id = 100;
        this.salary = 30000;
        this.gender = "Female";
        this.company = "XYZ";
        this.address = "Pune";
        this.phoneNo = 1010101010L;
        System.out.println("************************");
    }
    //constructor chaining => 33 -> 41 -> 47

    Employee(String name, int id, int salary){
        //calling a constructor with gender and company as params
        this("Male", "TCS");//constructor chaining
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    Employee(String gender, String company){
        this("pune", 1010101010L);//constructor chaining
        this.gender = gender;
        this.company = company;
    }
    Employee(String address, long phoneNo){
        this.address = address;
        this.phoneNo = phoneNo;
    }
    //parameterized constructors
    Employee(String name, int id, int salary, String gender, String company, String address, long phoneNo){
        System.out.println("************************");
        System.out.println("parameterized constructor called");
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.gender = gender;
        this.company = company;
        this.address = address;
        this.phoneNo = phoneNo;
        System.out.println("****************************");

    }
    //copy constructor - copy fields from one object to another object

    Employee(Employee employee){
        //'this' here will refer employee6 this constructor called by employee6
        this.name = employee.name;
        this.address = employee.address;
        this.gender = employee.gender;
        this.salary = employee.salary;
        this.id = employee.id;
        this.phoneNo = employee.phoneNo;
        this.company = employee.company;

    }

    void displayObjectAndMessage(){
        System.out.println("Hello " + this.name);
        System.out.println(this.id + "\n" + this.salary + "\n" + this.gender + "\n" + this.company + "\n" + this.address + "\n" + this.phoneNo);
    }
}









