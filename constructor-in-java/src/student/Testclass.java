package student;

public class Testclass {

    public static void main(String[] args) {
        Employee employee1 = new Employee(); //employee1=1000h employee1 will have 7 fields
        employee1.displayObjectAndMessage();

        Employee employee2 = new Employee(); //employee2=2000h employee1 will have 7 fields
        employee2.displayObjectAndMessage();

        Employee employee3 = new Employee(); //employee3=3000h employee1 will have 7 fields
        employee3.displayObjectAndMessage();

        Employee employee4 = new Employee("Anjali", 102, 80000, "Female", "MS", "Nagpur", 3030303030L);
        //employee4 = 4000h
        employee4.displayObjectAndMessage();

        Employee employee5 = new Employee("Kishor", 103, 40000, "Male", "Cognizant", "Kopergaon", 4040404040L);
        //employee5 = 5000h
        employee5.displayObjectAndMessage();

        Employee employee6 = new Employee(employee5);
        employee6.displayObjectAndMessage();

        Employee employee7 = new Employee("Moin", 104,120000);
        employee7.displayObjectAndMessage();

    }
}


