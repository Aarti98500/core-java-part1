package StreamExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<String> guestList = new ArrayList<>();
        guestList.add("Vikram");
        guestList.add("Vivek");
        guestList.add("Bhagyashree");
        guestList.add("Aarti");
        guestList.add("Karan");
        guestList.add("Moin");

        //stream is sequence of elements -> elements can be anything like Integers, String, Student etc.

        //Streams are used to replace for and while loops.

        Stream<String> StringStream1 = guestList.stream();
    }
}
