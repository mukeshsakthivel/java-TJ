class demo
{
    private int m,n;
    demo(int a,int b)
    {
        m=a;
        n=b;
    }
    int large()
    {
        if(m>n)
            return m;
        else
            return n;
    }
    void display()
    {
        int largervalue=large();
        System.out.println(largervalue);
    }
}
public class nesting_method_34 {
    public static void main(String args[]) {
        demo o = new demo(2, 5);
        o.display();

    }
}