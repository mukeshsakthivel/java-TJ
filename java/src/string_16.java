/*
* string literal means same string value can be store in same address
* eg: string a="abc" it can be store in STRING CONSTANT POLL
*     string b="abc"
*       its all have same address
* this method can be overcome the StringBuffer
* it is also called as StringBuilder
* it can be an heap memory using the buffer
* string is immutable
* */
public class string_16 {
    public static void main(String args[])
    {
        String a="java";
        String b="java";
        System.out.println("a hashcode  "+a.hashCode());
        System.out.println("b hashcode  "+b.hashCode());
        System.out.println("Equals :  "+a.equals(b));
        System.out.println(" equals ignore case "+a.equalsIgnoreCase(b));
        System.out.println(" length  "+a.length());
        System.out.println(" single char  "+a.charAt(0));
        System.out.println(" uppercase  "+a.toUpperCase());
        System.out.println("string is unmutable  "+a);//bec string is inmutable
        System.out.println(" lowwercase  "+a.toLowerCase());
        System.out.println(" replace "+a.replace("java","program"));
        System.out.println("string is unmutable  "+a);
        System.out.println(" finding "+a.contains("a"));
        System.out.println(" finding "+a.contains("z"));
        System.out.println(" finding "+a.isEmpty());
        System.out.println(" finding "+a.endsWith("a"));
        System.out.println(" finding "+a.startsWith("j"));
        System.out.println(" finding "+a.substring(2));
        System.out.println(" finding "+a.substring(0,3));
        char[]carry=a.toCharArray();
        for(char c:carry)
        {
            System.out.println(c+" ");
        }
        String d=" porgram ";
        System.out.println(" finding "+d.length());// space also be count
        System.out.println(" finding "+d.trim());// it elimanate the space
        System.out.println(" finding "+d.trim().length());//it is chaining





    }
}
