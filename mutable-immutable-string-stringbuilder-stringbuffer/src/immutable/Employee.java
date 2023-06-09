package immutable;

public final class Employee {
    private String name;
    private int id;
    private int salary;
    private Address address;

    public Employee(String name, int id, int salary, Address address) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.address = new Address(address.getLineNum(), address.getStreetName(), address.getCityName(), address.getPinCode());
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public Address getAddress() {
        return new Address(address.getLineNum(), address.getStreetName(), address.getCityName(), address.getPinCode());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", address=" + address +
                '}';
    }
}
