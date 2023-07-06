import java.util.Scanner;

public class array10 {
    public static void main(String args[]) {
       /* int a[]={10,20,30,40};
        System.out.println(a[1]);
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("--------------------------------------------------------------");
        for(int element:a)//enhance for loop
        {
            System.out.println(element);
        }*/
        Scanner in = new Scanner(System.in);
        int b[];//declaration
        b=new int[10];//memory declaration
        int[]c=new int[10];//
        for(int element:b)// IN JAVA ARRY STORE ZERO(0) VALUES IN THE ARRAY
        {
            System.out.println(element);
        }
        for(int i=0;i<7;i++)
        {
            System.out.print("enter the element");
            c[i]=in.nextInt();
        }
        for(int element:c) {
            System.out.println(element);
        }


    }
}