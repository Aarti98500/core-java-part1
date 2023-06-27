package encapsulation;

public class Driver {
    public static void main(String[] args) {
        Employee employee = new Employee("Aarti", "XYZ", 21, 100, 30000);
        employee.setSalary(0);
        System.out.println(employee.getName());
        employee.setSalary(25000);
        System.out.println(employee);
    }
}
