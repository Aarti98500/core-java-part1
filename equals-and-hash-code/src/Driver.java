public class Driver {
    public static void main(String[] args) {

        Student student1 = new Student("Aarti", 200,21);

        Student student2 = new Student("Aarti", 200, 21);

        Student student3 = new Student("Aarti", 200, 20);

        Student student4 = student1;

        Employee employee = new Employee("Aarti", 200, 20);

        System.out.println(student1.equals(student2));//true

        System.out.println(student1.equals(student3));//false

        System.out.println(student1.equals(student4));

        System.out.println(student1.equals(employee));//false

        System.out.println("Hashcode for student1 is : "+ student1.hashCode());
        System.out.println("Aarti hashcode is : "+"A".hashCode());//65*31^0
        System.out.println("Aarti hashcode is : "+"Aa".hashCode());//65*31^1 + 105*31^0
        System.out.println("Aarti hashcode is : "+"Aar".hashCode());//65*31^2 + 105*31^1 + 107*31^0
    }
}
