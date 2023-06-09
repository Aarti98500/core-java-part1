package driver;

import a.b.c.C;
import entities.Address;
import entities.College;
import entities.Employee;
import entities.Student;

public class Driver {

    public static void main(String[] args) {

        Address address = new Address();
        address.setFlatNum("A106");
        address.setLineNo("Solapur road");
        address.setTaluka("Haveli");
        address.setDistrict("Pune");
        address.setState("MH");

        College college = new College();
        college.setName("COE");
        college.setNumOfStaff(200);
        college.setNumOfStudents(2000);

        Employee employee = new Employee();
        employee.setName("Aarti");
        employee.setAge(22);
        employee.setCollege(college);

        Student student = new Student();
        student.setName("Vikram");
        student.setCollege(college);

        System.out.println(address.toString());
        System.out.println(college.toString());
        System.out.println(employee.toString());
        System.out.println(student.toString());


        C objC = new C();
 //       objC.defaultVariable=10;

        objC.publicVariable = 3000;
    }
}
