package functionalInterfaces;

/*Functional Interface has only one abstract method. We can use @FunctionalInterface annotation.
@FunctionalInterface optional to use by using this IDE forces us to avoid more than one abstract method.
It has built in functional Interface Consumer, Supplier, Predicate, and Function.
Consumer takes single input and produces no output.
Supplier takes no input but produces some output.
Predicate takes input (one argument) and produces boolean as output.
Function Takes input (one argument) and produces output.
*/
@FunctionalInterface
public interface MyFunctionalInterface {
    //void myMethod();
    void sum(int a, int b);
    default void myDefaultMethod(){
        System.out.println("My Default method");
    }

    static void myStaticMethod(){
        System.out.println("Static Method");
    }
}
