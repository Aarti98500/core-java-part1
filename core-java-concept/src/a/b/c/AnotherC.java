package a.b.c;

public class AnotherC {

    public static void main(String[] args) {
        C objectInsideSamePkg = new C();
        objectInsideSamePkg.defaultVariable = 20;
 //       objectInsideSamePkg.privateVariableC = 30; not allowed
        objectInsideSamePkg.protectedVariable = 40;
        objectInsideSamePkg.publicVariable = 100;
    }
}
