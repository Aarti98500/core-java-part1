/*
   In Exception hierarchy top level class is Throwable.
   Exception class extends Throwable

   compile time exception -> IOException extends exception
   compile time exception -> ClassNotFoundException extends exception
   compile time exception -> FileNotFoundException extends exception

   run time exception -> RunTimeException extends exception

   ArithmeticException extends RunTimeException
   NullPointerException extends RunTimeException
   IndexOutOfBoundException
   //ArrayIndexOutOfBoundException
   //StringIndexOutOfBoundException
   */

   /*
   There are two ways to handle ex exception
     1. Using try catch block.
     2. Using throws keyword with method header.
    */

public class ExceptionHandlingUsingThrowsKeyword {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 0;
        //the statement (s) that cause an exception must be put inside try block and should have a catch block to catch e
        //if an exceptions occurs then associated catch block is called and normal flow of progress gets executed.

        try {
            c = getC(a,b);
        }catch (ArithmeticException arithmeticException){
            System.out.println(arithmeticException.getMessage());
        }finally {
            //finally is used to free the resources
            //Here resources means db connections or file connection or sockets
            System.out.println("Finally block always gets executed not matter exception occurs or not.");
        }

        System.out.println(c);

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    private static int getC(int a, int b) throws ArithmeticException {
        int c = 0;
        c = a / b;

        System.out.println("getC method called.");
        return c;
    }
}
