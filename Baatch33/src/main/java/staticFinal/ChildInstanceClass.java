public class ChildInstanceClass extends ParentInstanceClass{
    public int l;

    public ChildInstanceClass(int k,int l) {
        this.k = k;
        this.l = l;
    }

    public ChildInstanceClass(int l) {
        this.l = l;
    }

    public static void main(String[] args){
        ChildInstanceClass c = new ChildInstanceClass(30);
        ChildInstanceClass c1 = new ChildInstanceClass(40,50);
        System.out.println(c.l+" "+c1.l+" "+c1.k);
    }
}
