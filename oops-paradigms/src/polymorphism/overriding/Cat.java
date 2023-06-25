package polymorphism.overriding;

public class Cat extends Animal {
  //   @Override
  //    private void walk() {
  //       System.out.println("Cat is walking");
  //     } this is not allowed

    @Override
    Cat walk(){
        System.out.println("Cat is walking.");
        return new  Cat();
    }

    @Override
    void run(String msg) {
        System.out.println("Cat is running.");

    }
}
