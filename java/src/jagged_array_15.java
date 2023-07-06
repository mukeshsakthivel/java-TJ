//jagged is different array zize of element

public class jagged_array_15 {
    public static void main(String args[]) {
        int [][]a = {
                {10, 20, 30,31},//a[0].length=4
                {40, 50, 60},//a[1].length=3
                {70, 80, 90,91}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                System.out.println(" " + a[i][j]);
            }
            System.out.println(" ");


        }
        for(int k[]:a)
        {
            for(int l:k)
            {
                System.out.print(+l+" ");
            }
            System.out.println(" ");
        }
    }

    }
