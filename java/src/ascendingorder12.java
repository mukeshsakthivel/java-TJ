import java.util.Arrays;

public class ascendingorder12 {
    public static void main(String args[]) {
        int a[]={8,4,7,9,45};
        System.out.println("before sorting:"+ Arrays.toString(a));//predefine pacakage
        int temp;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                  temp=a[i];
                  a[i]=a[j];
                  a[j]=temp;
                }

            }
        }
        System.out.println("after sort :"+Arrays.toString(a));

    }   }