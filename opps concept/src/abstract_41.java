abstract class mobile
{
    void voice()
    {
        System.out.println("voicecall");
    }
    abstract void display();//declaration
    abstract void camera();
}
class nokia extends mobile//it's comes error bec base class method can only declare we can give definition on it
{
    void display() {
        System.out.println("6inch");
    }
    void camera() {
        System.out.println("12mb");
    }
}
class sam extends mobile
{
    void display()
    {
        System.out.println("inch");
    }
    void camera()
    {
        System.out.println("16mb");
    }
    void colour()
    {
        System.out.println("white");
    }
}

public class abstract_41 {
    public static void main(String args[])
    {
        nokia n=new nokia();
        n.camera();
        n.voice();n.display();
        sam s=new sam();
        s.camera();s.colour();s.voice();s.display();
    }
}
