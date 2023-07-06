
import java.util.Scanner;
public class armstrong2
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the three digit number");
        int number = in.nextInt();
        int temp = number;//123
        int dig1, dig2, dig3;
        dig3 = temp % 10;//3
        temp = temp / 10;//12
        dig2 = temp % 10;//2
        temp = temp / 10;//1
        dig1 = temp % 10;//1

        int result = (dig1 * dig1 * dig1) + (dig2 * dig2 * dig2) + (dig3 * dig3 * dig3);
        if (result == number) {
            System.out.println(number + "is amstrong number");
        } else {
            System.out.println(number + "is not an amstrong number");
        }
    }
}
