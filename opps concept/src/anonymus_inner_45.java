abstract class ano
{
    abstract  void display();
}
class inner {
    //void outer()

    {
        ano o = new ano() {

            public void display() {
                System.out.println("anonymus method");
            }
        };
        o.display();
    }
}
public class anonymus_inner_45 {
    public static void main(String args[])
    {
        inner i=new inner();
        //i.outer();
    }
}
