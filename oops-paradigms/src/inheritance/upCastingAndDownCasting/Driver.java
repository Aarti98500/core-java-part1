package inheritance.upCastingAndDownCasting;

public class Driver {
    public static void main(String[] args) {
        Machine machine = new Machine();
        machine.startUP();
        machine.shutDown();


        Laptop laptop = new Laptop();
        laptop.startUP();
        laptop.doProgramming();
        laptop.shutDown();


        Printer printer = new Printer();
        printer.startUP();
        printer.print();
        printer.shutDown();

        /*
        In upCasting you create an object of child class
        and assign it to parent class reference variable
        Parent reference
             ^
             |
             |
        Child object
        Every laptop will be machine.
         */

        Machine laptop1 = new Laptop();//upCasting
        laptop1.startUP();
        laptop1.shutDown();

        Machine printer1 = new Printer();//upCasting
        printer1.startUP();
        printer1.shutDown();


        /*
        In downCasting you create an object of parent class
        and assign it to child class reference variable
        Parent object
             |
             |
        Child reference
        Wii every Machine be a Laptop?
         */

        Laptop laptop2 = (Laptop) new Machine();
        laptop2.startUP();
  //      laptop2.doProgramming();
        laptop2.shutDown();
    }
}
