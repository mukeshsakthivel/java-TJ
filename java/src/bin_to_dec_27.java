import static java.lang.Math.pow;

public class bin_to_dec_27 {
    public static int bin(int n)
    {
        int dec=0,power=0;
        while(n!=0)//1100
        {
            int rem=n%10;//0
            dec+=rem* Math.pow(2,power);
            n=n/10;//100
            power++;
        }
        return dec;
    }
    public static void main(String args[]) {
        System.out.println("decimal : "+bin(1100));
    }
}
