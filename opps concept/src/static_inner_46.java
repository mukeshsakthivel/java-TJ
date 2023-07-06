class outerclass
{
    static int x=5;
    static class innerclass
    {
        void display() {
            System.out.println("x :"+x);
        }
    }

}
public class static_inner_46 {
    public static void main(String args[])
    {
        outerclass.innerclass o=new outerclass.innerclass();
        o.display();

    }
}
