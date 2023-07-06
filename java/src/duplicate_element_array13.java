public class duplicate_element_array13 {
    public static void main(String args[]) {
        int []a={1,3,5,5,4,1,9,7,2,4,2,};
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    System.out.println("duplicate elements are"+a[i]);
                }
            }
        }
    }
}
