import java.util.Arrays;
import java.util.Scanner;
public class method_using_array_24
{
    public static int[] soartarray()//static is comalsari bec it is present in main class
    {
        System.out.println("enter the limit");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int []a= new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the value");
             a[i]=in.nextInt();
        }
        Arrays.sort(a);
        return a;
    }
    public static void main(String args[]) {
    int b[]=soartarray();
    for(int c:b)
    {
        System.out.println(c);
    }

    }
}

