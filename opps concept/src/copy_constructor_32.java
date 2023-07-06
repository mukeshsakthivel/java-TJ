class complex //we can print like wise 2+3i
{
    public int real,img;
    public  complex()  //o
    {
        img=5;
        real=2;
    }
    public  complex(int rea,int im)  //o1
    {
        real=rea;
        img=im;

    }
    public  complex(complex o1)       //complex constructor
    {
        real= o1.real;
        img=o1.img;

    }
    public String toString()//when we call the class it can be default to print it
    {
        return "("+real+"+"+img+"i)";
    }
}
public class copy_constructor_32 {
    public static void main(String args[])
    {
        complex o=new complex();
        System.out.println(o);
        complex o1=new complex(2,10);
        System.out.println(o1);
        complex o2=new complex(o1);
        System.out.println(o2);

    }





}
