package inheritance.typesOfInheritance.Multiple;

/*
                       A

                B             C

                       D
 */

public class D extends B implements C{
    @Override
    public void display() {//This display is coming from interface C.
        super.display();
        System.out.println("Display method called from class A.");
    }
}
