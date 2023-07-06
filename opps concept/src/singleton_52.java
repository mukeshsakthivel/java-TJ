// class have only one object we cant create the two object
class single
{
    private single()//creating constructor in private
    {
    }
    static single a=null;
    static single display()
    {
        if(a==null)
        {
            a=new single();
        }
        return a;
    }
    void dis()
    {
        System.out.println("singleton");
    }
}
public class singleton_52
{
    public static void main(String args[])
    {
        single o=single.display();
        single a=single.display();
        o.dis();
        a.dis();
    }
}
