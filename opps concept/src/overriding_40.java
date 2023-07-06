class user
{
    int age;
    String name;
    user(String a,int b)
    {
        age=b;
        name=a;
    }
    void display()
    {
        System.out.println("age"+age);
        System.out.println("age"+name);
    }
}
class methoda extends user//error bec in base class having a constructor
{
    String com;
    methoda(String a,int b,String c) {
        super(a, b);
        com = c;
    }
    void display()//it's a method overriding
    {
        System.out.println(name+" "+age+" "+com);
    }

}
class clint extends methoda   // me must declaring the value in extends class
{
    clint(String a,int b,String c) {
        super(a, b, c);
    }
}

public class overriding_40 {
    public static void main(String args[]) {

        methoda o = new methoda("zxc", 35, "mnb");
        o.display();


    }
}