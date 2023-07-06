class student
{
   public  int rollno;
   public  String name;
    student(int roolno,String name)
    {
        this.rollno=roolno;
        this.name=name;
    }
    void print()
    {
        System.out.print(rollno);
        System.out.println("  "+name);
        System.out.println("--------------------");
    }
}
public class array_of_object_33 {
    public static void main (String args[])
    {
        student o[]=new student[3];
        o[0]=new student(11,"pa");
        o[1]=new student(35,"mb");
        o[2]=new student(00,"zz");
        for(int i=0;i<o.length;i++)
        {
            o[i].print();
        }

    }

}
