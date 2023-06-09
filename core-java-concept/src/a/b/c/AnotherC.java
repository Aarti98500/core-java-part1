package a.b.c;

public class AnotherC {

    public static void main(String[] args) {
        C objectInsideSamePkg = new C();
        objectInsideSamePkg.defaultvariable = 20;
//         objectInsideSamePkg.privateVariableC = 30; not allowed
        objectInsideSamePkg.protectedvariable = 40;
        objectInsideSamePkg.publicVariable = 100;
    }
}
