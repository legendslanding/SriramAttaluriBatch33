package objectOrientedProgramming;

public class FinanceDepartment extends Department{
    public int i;
    public FinanceDepartment(int i)
    {
        this.i=i;
    }
    @Override
    int getDepartmentSize()
    {
       return i;
    }

    public static void main(String args[]){
        FinanceDepartment f = new FinanceDepartment(5);
        System.out.println(f.getDepartmentSize());    }
}
