import java.util.Scanner;

public class dec_to_bin_26 {
    public static void dectobin(int n)//12
    {
        int []num=new int[1000];
        int i=0;
        while(n>0)//12>0
        {
            num[i]=n%2;//0
            n=n/2;//6
            i++;//1
        }
        //0 0 1 1 we take left to right bec its binary formate
        for(int j=i-1;j>=0;j--)
        {
            System.out.print(num[j]);

        }
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("enter decimal value");
        int n=in.nextInt();
        System.out.println("decimal no :"+n);
        System.out.print("binary no ");
        dectobin(n);
    }
}
