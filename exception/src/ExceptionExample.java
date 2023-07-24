public class ExceptionExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = a/b;//exception occurs here as / 0 is undefined, ststements below this line will not be executed if exception not handled
        System.out.println(c);
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }

    }
}
