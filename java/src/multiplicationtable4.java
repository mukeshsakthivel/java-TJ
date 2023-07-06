import java.util.Scanner;
public class multiplicationtable4
{ public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    System.out.println("enter the limit");
    int l = in.nextInt();
    System.out.println("enter the table");
    int t = in.nextInt();
    for (int i = 0; i <= l; i++) {
        System.out.println(i+"x"+t+ "="+ (i * t));
    }
}

}

