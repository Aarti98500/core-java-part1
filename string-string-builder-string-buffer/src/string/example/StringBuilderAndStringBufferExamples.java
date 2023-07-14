package string.example;

public class StringBuilderAndStringBufferExamples {
    public static void main(String[] args) {
        //StringBuilder is mutable class
        //StringBuilder isn't suitable for synchronization
        //that means there is not thread safety
        StringBuilder builder = new StringBuilder("Aarti");

        System.out.println(builder);

        StringBuilder newBuilder = builder.append("Inamdar");

        System.out.println(newBuilder);
        System.out.println(builder == newBuilder);

        //StringBuffer is mutable class
        //StringBuffer is suitable for synchronization
        StringBuffer buffer = new StringBuffer("Aarti");

        System.out.println(buffer);

        StringBuffer newBuffer = buffer.append("Inamdar");

        System.out.println(newBuffer);
        System.out.println(buffer == newBuffer);
    }
}
