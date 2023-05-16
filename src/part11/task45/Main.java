package part11.task45;


public class Main {

    public static void main(String[] args) {
        try {
            doSomething();
        } catch (MyCustomException e) {
            System.out.println("MyCustomException: " + e.getMessage());
        }
    }

    public static void doSomething() throws MyCustomException {
        throw new MyCustomException("Hello from my custom exception");
    }
}
