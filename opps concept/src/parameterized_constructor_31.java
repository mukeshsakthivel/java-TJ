class box
{
    int l,b;
    public box()
    {
        l=3;
        b=5;
    }
    public box(int x,int y)
    {
        l=x;
        b=y;
    }
    public box(int x)
    {
        l=b=x;
    }
    int area()
    {
        return l*b;
    }
}
public class parameterized_constructor_31
{
    public static void main(String args[])
    {
        box o=new box();
        box o1=new box(3,5);
        box o2=new box(3);
        System.out.println(+o.area());
        System.out.println(+o.area());
        System.out.println(+o2.area());
    }

}

