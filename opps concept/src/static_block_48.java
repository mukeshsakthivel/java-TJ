class block
{
    static {
        System.out.println("3 block");
    }
}
public class static_block_48 {
    static {
        System.out.println("1 block");
    }
    public static void main(String args[])
    {
        block b=new block();

    }
    {
        System.out.println("main");
    }
    static{
        System.out.println("2 block");
    }

}
