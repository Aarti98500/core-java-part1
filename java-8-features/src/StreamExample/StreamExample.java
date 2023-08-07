package StreamExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;


class Student {
    private final String name;
    private final int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (! (o instanceof Student student)) return false;

        return age == student.age
                && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    Stream<String> stringStream1 = guestList.stream();

    Stream<String> stringStream2 = stringStream1.filter(s1 ->{
        System.out.println("s1 is in filter : " + s1);
        return s1.length() >= 5;
    });

    Stream<String> stringStream3 = stringStream2.map(s2 ->{
        System.out.println("s2 is in map : " + s2);
        return s2.toLowerCase();

    });

    stringStream3.forEach(s3 -> System.out.println("s3 in the stream - " + s3));

    stringStream1.filtter(s3 -> System.out.println)
}

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
