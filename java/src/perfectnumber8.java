/*
6
1%6=0
2%6=0
3%6=0      the first continue 0 factor number can be add we get the perfect number
4%6=2                   1+2+3=6
5%6=1           itself divide number cant take it so for loop not taken this
6%6=0

* */


import java.util.Scanner;

public class perfectnumber8 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number");
        int n = in.nextInt();
        int sum=0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            System.out.println(n + "is a perfect number");
        } else {
            System.out.println(n + "is not a perfect number");
        }
    }
}