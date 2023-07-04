package inheritance.multipleInheritance;

public class D extends A implements B,C {
    @Override
    void displayA() {
        System.out.println("Print D");
        super.displayA();
    }

    @Override
    public void displayB() {
        System.out.println("Print B");

    }

    @Override
    public void displayC() {
        System.out.println("Print C");
    }
}
