class outer
{
    void diisplay()
    {
        class inner
        {
            void innerfun()
            {
                System.out.println("local inner class");
            }
        }
        inner i=new inner();
        i.innerfun();
    }

}
public class local_inner_44 {
    public static void main(String args[])
    {
        outer o=new outer();
        o.diisplay();
    }
}
