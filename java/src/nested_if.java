/*
NESTED IF STATEMENTG
a company insures its drivers following cases
a.if the driver is married
b.if the driver is unmarried,male & above 30years of age
c.if the driver is unmarried,female& above 25 years of ago
*/
import java.util.Scanner;
public class nested_if {
  public static void main(String args[])
  {
      Scanner in =new Scanner(System.in);
      System.out.println("enter the marital state m/u");
      char marital=in.next().charAt(0);
      if(marital=='u' || marital=='U')
      {
          System.out.println("enter the marital state m/f");
          char gender=in.next().charAt(0);
          System.out.println("enter the age");
          int age=in.nextInt();
           if((gender=='m'||gender=='M')&&age>=30)
           {
               System.out.println("you are eligibal for insurance");
           }
          else if ((gender=='f'||gender=='F')&&age>=25)
          {
              System.out.println("you are eligibal for insurance");
          }
           else {
               System.out.println("invalid input");
           }
      }
      else if(marital=='m'||marital=='M')
      {
          System.out.println("you are eligibal for insurance");
      }
      else {
          System.out.println("invalid input");
      }
  }
}
