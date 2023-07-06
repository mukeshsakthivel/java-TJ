class rectange //we not declare any type so we can access the  all data in main function also
{
    int length,width;//it is default so we can use in main function
    void get(int x,int y)
    {
        length=x;
        width=y;
    }
    int area()
    {
        int a=length*width;
        return a;
    }
}

public class class_rectange_28 {
    public static void main(String args[]) {
        rectange o1 = new rectange();
        rectange o2 = new rectange();
        o1.length=10;
        o1.width=20;
        System.out.println("rectange "+o1.area());
        o2.get(10,20);
        System.out.println("rectange oobject o2 "+o2.area());


    }
}