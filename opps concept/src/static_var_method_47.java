class statica
{
    static int a=5;//common value for all object
    int b=10;//it's insatance every object can store the different value
    void show()
    {
        System.out.println("a"+a+"b  "+b); //we can't print the a value bec a is static
    }
    static void show1()
    {
        System.out.println("a: "+a);//we cant print the b value
    }

}
public class static_var_method_47 {
    public static void main(String args[])
    {
        statica o=new statica();
        o.show();
        statica o1=new statica();
        o1.b=100;
        statica.a=50;
        o1.show();
        o.show();
    }
}
