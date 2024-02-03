package anonymousInnerClasses;

        /*Yes, in the context of Java, anonymous inner classes are often used for implementing interfaces
        with a single abstract method, which are also known as functional interfaces. This is because anonymous inner classes
        provide a concise way to define and instantiate a class on-the-fly for the purpose of implementing a specific interface
        or extending a specific class.*/

public class AnonymousInnerClass {
    public static void main(String[] args){
        AnonymousInterface ai = new AnonymousInterface() {
            @Override
            public void myMethod() {
                System.out.println("Anonymous Interface Implementation");
            }
            @Override
            public void factorial(int n) {
                int fact=1;
                while(n!=1){
                    fact = fact*n;
                    n--;
                }
                System.out.println(fact);
            }
        };
        ai.myMethod();
        ai.factorial(5);
    }
}
