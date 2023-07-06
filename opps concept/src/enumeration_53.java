class enumm
{
    enum level
    {
        a,
        b,
        c
    }
    void display()
    {
        level a=level.a;
        System.out.println(" is "+a);
        switch (a)
        {
            case b:
                System.out.println("b value");
                break;
            case a:
                System.out.println("a value");
        }
        for(level b:level.values())//values is default
        {
            System.out.println(b);
        }
    }
}

public class enumeration_53 {
    public static void main(String args[])
    {
     enumm a=new enumm();
     a.display();
    }
}
