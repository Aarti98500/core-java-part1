package polymorphism.overloading;

public class MethodOverloadingExample {

    void displayMsg(){
        System.out.println("A Method with no argument called.");
    }

    private void displayMsg(String msg){
        System.out.println("A Method with one param called with msg "+ msg);
    }

    public String displayMsg(int num){
        System.out.println("A method with one param called with num "+ num);
        return "Hello world";
    }

    protected int displayMsg(int num, String msg){
        System.out.println("A Method with one param called with num "+ num + "msg " + msg);
        return 0;
    }

    void displayMsg(String msg, int num){
        System.out.println("A method with one param called with msg "+ msg + "num " + num);
    }

    public static void main(String[] args) {
        MethodOverloadingExample methodOverloadingExample = new MethodOverloadingExample();
        methodOverloadingExample.displayMsg();
    }



}
