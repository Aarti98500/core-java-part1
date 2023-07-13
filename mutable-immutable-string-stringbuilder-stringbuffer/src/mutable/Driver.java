package mutable;

public class Driver {
    public static void main(String[] args) {
        Address address = new Address(100, "Varadvinayak Colony","Pune",412308);

        Employee employee = new Employee("Aarti", 108, 30000, address);

        employee.id = 110;//employee objects id has changed, hence employee object are metable
    }
}
