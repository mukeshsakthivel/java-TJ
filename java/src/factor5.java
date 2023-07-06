/*factor of 5
5%1
5%2
5%3           ==0 means is factor of 5
5%4
5%5
*/
import java.util.Scanner;
public class factor5 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i+"   ");
            }
        }
    }
}