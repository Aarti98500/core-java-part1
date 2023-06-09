package src;

public class DataTypesExample {
    public static void main(String[] args) {
        //DataTypes --> Single Line Comment

        /*
        Data Types
             1.Primitive - there are 8 primitive data types
               Types and Size
               1. byte - 1 B
               2. short - 2 B
               3. char - 2 B
               4. int - 4 B
               5. float - 4 B
               6. long - 8 B
               7. double - 8 B
               8. boolean - 8 B

             2. Non Primitive
               Class and Arrays
         */

        byte bytedata = 100; // byte is data type and bytedata is variable name and 100 is value of variable

        short shortdata = 30000;
        int intdata = 200000;
        long longdata = 200000000;

        float floatdata = 10.1212121212f;
        double doubledata =10.1212121212121212d;

        char chardata = 'A'; //ASCII - 128 , UTF-8 bit = 256
        boolean bool = true;

        System.out.println("byte Min : "+ Byte.MIN_VALUE);
        System.out.println("byte : "+bytedata);
        System.out.println("byte Max : "+ Byte.MAX_VALUE);

        System.out.println("short Min : "+ Short.MIN_VALUE);
        System.out.println("short : "+shortdata);
        System.out.println("short Max : "+ Short.MAX_VALUE);

        System.out.println("int Min : "+ Integer.MIN_VALUE);
        System.out.println("int : "+intdata);
        System.out.println("int Max : "+ Integer.MAX_VALUE);

        System.out.println("long Min : "+ Long.MIN_VALUE);
        System.out.println("long : "+longdata);
        System.out.println("long Max : "+ Long.MAX_VALUE);

        System.out.println("float Min : "+ Float.MIN_VALUE);
        System.out.println("float : "+floatdata);
        System.out.println("float Max : "+ Float.MAX_VALUE);

        System.out.println("double Min : "+ Double.MIN_VALUE );
        System.out.println("double : "+doubledata);
        System.out.println("double Max : "+ Double.MAX_VALUE);

        System.out.println("bool Min : "+ Boolean.TRUE);
        System.out.println("bool : "+bool);
        System.out.println("bool Max : "+ Boolean.FALSE);


    }
}
