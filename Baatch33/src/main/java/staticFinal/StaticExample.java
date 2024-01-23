
public class StaticExample {
    public static int i=10;

    public static int staticMethod(){
        return i;
    }
    public static void main(String[] args){
        StaticExample s = new StaticExample();
        FinalExample f = new FinalExample();
        System.out.println(s.i); //static variable
        System.out.println(staticMethod()); //without object
        System.out.println(s.staticMethod()); //through object
        System.out.println(f.j);  //final variable through object
        System.out.println(f.finalMethod()); // final method through object
    }
}
