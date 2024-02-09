package threads;

public class SingletonMain {
    public static void main(String[] args) {
        SingletonExample singleton1 = SingletonExample.getInstance();
        SingletonExample singleton2 = SingletonExample.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}
