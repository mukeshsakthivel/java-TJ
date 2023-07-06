class test
{
    final int a=10;
    final int b;//when we use the final declaration we must give the defination using the constructor
    final int c;
    test(int a,int c)
    {
        b=a;
        this.c=c;
    }
    void display()
    {
        System.out.println(a+" "+b+" "+c);
    }
}
public class final_49 {
public static void main(String args[])
{
    test a=new test(50,100);
    a.display();


}
}