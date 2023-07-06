/*
approach 1
import java.awt.*;
public class awtdemo001
{
    public static void main(String args[])
    {
        Frame frm=new Frame("mukesh");
        frm.setSize(1000,600);
        frm.setLayout(null);
        Button btn=new Button("click");
        btn.setBounds(75,75,200,50);//x,y,w,h

        frm.add(btn);
        frm.setVisible(true);
    }
}
--------------------------------------------------------*/
/*
approach 2
import java.awt.*;
public class awtdemo001 extends Frame
{
    Button btn;
    public awtdemo001()
    {
        super("mukesh");//super function can be derive class value to base class
        setSize(1000,600);
        setLayout(null);
        btn=new Button("click");
        btn.setBounds(75,75,200,50);//x,y,w,h

        add(btn);
        setVisible(true);
    }
    public static void main(String args[])
    {
        awtdemo001 o=new awtdemo001();
    }
}
--------------------------------------------------------*/
//appr
import java.awt.*;
import java.awt.event.*;//for actionlistener
class myapp extends Frame implements ActionListener
{
    Button btn;
    Label lbl;

    public myapp() {
        super("mukesh");//super function can be derive class value to base class
        setSize(1000, 600);//frame can be extends
        setLayout(null);

        btn = new Button("click");
        btn.setBounds(75, 75, 200, 50);//x,y,w,h

        btn.addActionListener(this);//its the actionlistener for this button

        add(btn);
        setVisible(true);
        //label
        lbl=new Label("---------");
        lbl.setBounds(75, 150, 200, 50);//x,y,w,h
        add(lbl);

        //IT IS CLOSE COMMAND
        this.addWindowListener(new WindowAdapter()
        {//this--means entha class
            public void windowClosing(WindowEvent we)//predefined function
            {
              System.exit(0);
            }
        });

    }
    public void actionPerformed(ActionEvent e) {
        lbl.setText("it's a actionListener doing ");

    }
}
public class awt_actionlistener_001
{
    public static void main(String args[])
    {
        myapp o=new myapp();
    }
}
