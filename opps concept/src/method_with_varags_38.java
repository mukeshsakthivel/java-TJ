class method
{
    public static   void name(String... names)// we can store the value in array using of ...
    {
        for(String a:names)
        {
            System.out.println(a);
        }
    }
}
public class method_with_varags_38 {
    public static void main(String args[]) {
        method o = new method();
        o.name("mukesh","name");
        //(or)
        method.name("mukesh","name");
    }
}