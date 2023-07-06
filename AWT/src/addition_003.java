import java.awt.*;
import java.awt.event.*;
class addition extends Frame implements ActionListener
{
    Label l1,l2,l3;
    TextField tx1,tx2;
    Button b1;
    addition()
    {
            super("addition");
            setSize(1000,600);
            setLayout(null);
            setVisible(true);

            l1=new Label("enter value");
            l1.setBounds(10,50,100,30);
            l2=new Label("enter value");
            l3=new Label("-------");
            l2.setBounds(10,100,100,30);
            l3.setBounds(10,200,300,30);

            tx1=new TextField();
            tx2=new TextField();
            tx1.setBounds(150,50,250,30);
            tx2.setBounds(150,100,250,30);

            b1=new Button("addition");
            b1.setBounds(150,150,100,30);
            b1.addActionListener(this);

            add(l1);
            add(l2);
            add(l3);
            add(tx1);
            add(tx2);
            add(b1);



        this.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we )
            {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String s1=tx1.getText();
        String s2=tx2.getText();

        if(s1.isEmpty()||s2.isEmpty())
        {
            l3.setText("please enter value");
        }
        else {
            int a=Integer.parseInt(s1);
            int b=Integer.parseInt(s2);
            int c=a+b;
            String re=String.valueOf(c);
            l3.setText("total:"+re);}

    }
}
public class addition_003 {
    public static void main(String args[])
    {
        addition i=new addition();
    }
}
