
import java.util.Scanner;
public class findingamstrong3
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int dig1, dig2, dig3,temp,result;
        for(int number=100;number<=999;number++)
        {
            temp = number;//123
            dig3 = temp % 10;//3
            temp = temp / 10;//12
            dig2 = temp % 10;//2
            temp = temp / 10;//1
            dig1 = temp % 10;//1

             result = (dig1 * dig1 * dig1) + (dig2 * dig2 * dig2) + (dig3 * dig3 * dig3);
            if (result == number) {
                System.out.println(number + "is amstrong number");
            }
        }
    }

}
