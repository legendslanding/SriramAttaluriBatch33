package functionalInterfaces;

//Functional Interface and Lambda Expressions

public class MyFunctionalClass {
    public static void main(String[] args) {
        /*MyFunctionalInterface f = new MyFunctionalInterface() {
            @Override
            public void myMethod() {
                System.out.println("Abstract Functional Method");
            }
        };
        f.myMethod();
        f.myDefaultMethod();
        MyFunctionalInterface.myStaticMethod();*/

        /*MyFunctionalInterface f = () -> System.out.println("Abstract Functional Method");
        f.myMethod();
        f.myDefaultMethod();
        MyFunctionalInterface.myStaticMethod();*/

        MyFunctionalInterface s = (a,b) -> System.out.println(a+b);
        s.sum(5,6);
    }
}
