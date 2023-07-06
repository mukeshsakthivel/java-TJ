//import java.lang.foreign.SymbolLookup;
import java.util.Scanner;

/*
145     1!=1
        4!=24
        5!=120
           145 is a strong number
* */
public class strongnumber9 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number");
        int num = in.nextInt();//145
        int orgvalue=num;
        int rem,fact,i,sum=0;
        while(num>0)
        {
            rem=num%10;//5 4 1
            fact=1;
            for(i=1;i<=rem;i++)
            {
                fact=fact*i;
            }
            sum=sum+fact;
            num=num/10;//14 1 0
        }
        if(orgvalue ==  sum)
        {
            System.out.println(orgvalue+"is a strong number");
        }
        else
        {
            System.out.println("it is not a strong number");
        }

    }
}