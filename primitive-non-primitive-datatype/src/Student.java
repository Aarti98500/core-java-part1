public class Student {
    //properties or fields or attributes
    String name;
    int age;
    char div;
    int id;
    String collegename;

    //methods or behaviour or actions

    void study(){
        System.out.println(this.name + " is studying");
    }

    void play(){
        System.out.println(this.name + " is playing");
    }

    void commute(){
        System.out.println(this.name + " is commuting");
    }

}

class Example{
    public static void main(String[] args) {
        //object is an entity of class
        int x = 100;
        Student aarti = new Student();
        /*
        new keyword creates an object in heap
        aarti is reference variable for the object created
        Student() is no-argument constructor coll
         */
        aarti.name = "Aarti";
        aarti.age = 21;
        aarti.id = 108;
        aarti.div ='A';
        aarti.collegename = "Annasaheb magar mahavidyalay";
        //methods for aarti
        aarti.commute();
        aarti.study();
        aarti.play();
    }
}

