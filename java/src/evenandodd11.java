import java.util.Scanner;

public class evenandodd11 {

        public static void main(String args[]) {
            int e=0,o=0;
            Scanner in=new Scanner(System.in);
            System.out.println("enter the limit");
            int  n=in.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                System.out.println("enter the value a["+i+"]");
                a[i]=in.nextInt();
            }
            for(int element:a)
            {
                if(element%2==0)
                {
                    System.out.println(element);
                    e++;
                }
                else {
                    System.out.println(element);
                    o++;
                }
            }
            System.out.println("even number count"+e);
            System.out.println("odd number count"+o);

        }
    }
