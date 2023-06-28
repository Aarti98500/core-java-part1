package abstractionClass;

public class Rectangle extends Shape {

    float length;
    float breadth;

    public Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void draw() {
        System.out.println("I am drawing Rectangle.");
    }

    @Override
    public double calculateArea() {
        return length*breadth;
    }
}
