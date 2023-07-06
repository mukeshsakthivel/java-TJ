/*INNER CLASS
* Nested inner class
* local inner class
* anonymous inner class
* static inner class
* */
class outer1
{
    int a=5;
    class inner {
        int b = 50;

        void innerdisplay() {
            System.out.println(a);
            System.out.println(b);
        }
    }

        void outerdisplay()
        {
            inner i=new inner();
            i.innerdisplay();
            System.out.println(i.b);
        }

}
public class nested_inner_43 {
    public static void main(String args[]) {
        outer1 o=new outer1();
        o.outerdisplay();
        outer1.inner i=new outer1().new inner();
        i.innerdisplay();



    }
}
