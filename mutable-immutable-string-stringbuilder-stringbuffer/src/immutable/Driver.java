package immutable;

public class Driver {
    public static void main(String[] args) {
        Address address = new Address(100, "Varadvinayak Colony", "Pune", 412308);

        Employee employee = new Employee("Aarti", 108, 30000, address);

        System.out.println(employee);
        address.setLineNum(200);
        System.out.println(employee);
        employee.getAddress().setLineNum(300);
        System.out.println(employee);
    }
}
