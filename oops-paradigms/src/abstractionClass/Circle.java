package abstractionClass;

public class Circle extends Shape{

    float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("I am drawing a Circle.");
    }

    @Override
    public double calculateArea() {
        return 3.14*radius*radius;


    }

    @Override
    void displayMsg() {
        super.displayMsg();
    }
}
