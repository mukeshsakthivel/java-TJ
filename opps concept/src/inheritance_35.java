/*
SINGLE
class father extends son  //base
{
    void  house ()
    {
        System.out.println("its house ");
    }
}
class son
{
    void car()
    {
        System.out.println("it the class");
    }
}

public class single_inheritance_35 {

        public static void main(String args[])
        {
            father o=new father();
            o.house();
            o.car();

    }
}
*/
//-------------------------------------------------------
/* MULTILEVEL
class grandfather
{
    void land()
    {
        System.out.println("grand father land");
    }
}
class father extends grandfather //base
{
    void  house ()
    {
        System.out.println("its house ");
    }
}
class son extends father
{
    void car()
    {
        System.out.println("it the class");
    }
}


public class inheritance_35 {

        public static void main(String args[])
        {
            son o=new son();
            o.car();
            o.house();
            o.land();

    }
}
*/
//-------------------------------------------------------
//HIERARCHICAL INHERITANCE
class shape
{
    float length,breath,radius;
}
class rect extends shape
{
    rect(float x,float y)
    {
        length=x;
        breath=y;
    }
    float rectangle_area()
    {
       return length*breath;
    }
}
class circle extends shape
{
    circle(float ra)
    {
        radius=ra;
    }
    float circle_area()
    {
        float a=3.14f*(radius*radius);
        return a;
    }
}
class square extends shape
{
    square(float l)
    {
        length=l;
    }
    float square_area()
    {
        return (length*length);
    }
}
public class inheritance_35
{
    public static void main(String args[])
{
    rect o1=new rect(2,5);
    circle o2=new circle(5);
    square o3=new square(3);
    System.out.println("area of rectange"+o1.rectangle_area());
    System.out.println("area of circle"+o2.circle_area());
    System.out.println("area of square"+o3.square_area());
}
}
