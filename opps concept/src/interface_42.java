interface demo1
{
    int a=5;//it as final static
    void fun1();//method declaration and it is defaultly public



     static void fun2()
    {
        System.out.println("fun2");
    }

    default void fun4()
        {
            System.out.println("fun4");
        }

    private void fun5()
    {
        System.out.println("fun5");
    }
}
interface demo2 extends demo1{
    void fun3();
}
class class1 implements demo2
{
    public void fun1()//method defination
    {
        System.out.println("fun1");
    }
    public void fun3()
    {
        System.out.println("fun3");
    }

}
public class interface_42
{
    public static void main(String args[])
    {
        class1 c=new class1();
        c.fun1();
       demo1.fun2();
        c.fun3();
        c.fun4();

    }
}
