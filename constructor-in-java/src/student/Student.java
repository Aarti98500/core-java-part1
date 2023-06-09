package student;

public class Student {

    String name;
    int id;
    int rollNum;
    int regNum;
    char div;
    String college;

    //no arg cons

    public Student() {
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Student(String name, int id, int rollNum, int regNum, char div, String college) {
        this.name = name;
        this.id = id;
        this.rollNum = rollNum;
        this.regNum = regNum;
        this.div = div;
        this.college = college;
    }

    public void play(){
        System.out.println( "student.Student" + this.name + "is playing");
    }

    public void commute(){
        System.out.println( "student.Student" + this.name + "is commuting");
    }

    @Override
    public String toString() {
        return "student.Student{" +  name + " " + id + " " + rollNum + " " + regNum + " " + div + " " + college + "}";
    }
    //in tostring method, it doesn't take any params but it returns string and it have access level 'public'
}


