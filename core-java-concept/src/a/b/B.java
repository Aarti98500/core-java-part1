package a.b;

import a.b.c.C;

public class B extends C {
    int b;

    void display() {
        System.out.println(this.protectedvariable);
//        System.out.println(this.privateVariable);
//        System.out.println(this.defaultVariable);
    }


    public static void main(String[] args) {
        C objCinclass = new C();
//        objCinclass.defaultVariable = 30;
        objCinclass.publicVariable = 2000;

    }
}
