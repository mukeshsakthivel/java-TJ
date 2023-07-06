class Super
{
    public void display()
    {
        System.out.println("super display");//we can be overriding
    }
    final void finaldisplay()
    {
        System.out.println("final display");//we can't be overriding
    }
}
class sub extends Super
{
 public void display()
  {
      System.out.println("overridding display");//overriding in super class
  }
}

public class final_method_50 {
    public static void main(String args[])
    {
        Super o=new Super();
        sub a=new sub();
        o.display();
        a.display();
    }
}
