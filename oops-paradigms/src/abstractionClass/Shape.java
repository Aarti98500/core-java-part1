package abstractionClass;

public abstract class Shape {
    abstract void draw();
    public abstract double calculateArea();
    void displayMsg(){
        System.out.println("Shaping is getting drawn.");
    }
}
