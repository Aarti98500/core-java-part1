package encapsulation;

public class Employee {
    private String name;
    private String address;
    private int age;
    private int id;
    private int salary;

    public Employee(String name, String address, int age, int id, int salary) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.id = id;

        if (salary > 10000)
        this.salary = salary;
        else
        this.salary = 10000;


    }
    public Employee(String name, String address, int age, int id){
        this.name = name;
        this.address = address;
        this.age = age;
        this.id = id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }


    public void setSalary(int salary){
        if (salary > 10000)
        this.salary = salary;
        else
            this.salary = 10000;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
