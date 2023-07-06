/**
 * Stingbuffer is thread safe
 * StringBuilding is not a thread safe
 * ITIS MUTABLE WE CAN CHANGE THE VALUE
 */
public class stringbugger_17 {
    public static void main(String args[])
    {
        StringBuffer buffer=new StringBuffer("java");
        System.out.println(buffer);
        buffer.append(" program ");// it is MUTABLE
        System.out.println(buffer);
      // refer the other topic in note
        StringBuffer a=new StringBuffer("");
        System.out.println(a.capacity());//default is 16
        a.append("hello");
        System.out.println(a.capacity());
        // refer the other topic in note


    }

}
