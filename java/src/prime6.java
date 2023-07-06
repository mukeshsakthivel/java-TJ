/*
prime number factor it has two zero
5
1 %5=0
2%5=1
3  =2
4  =1
5  =0
it has two zero so 3 is prime number */
import java.util.Scanner;
public class prime6 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number");
        int n = in.nextInt();
        int f = 0;
        for (int i=1; i<=n; i++) {
            if (n % i == 0) {
                f++;
            }}
            if(f==2)
            {
                System.out.println(n+"is a prime number");
            }
            else
            {
                System.out.println("it is not a prime number");

            }
        }
    }