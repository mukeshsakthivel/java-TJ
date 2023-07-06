import java.awt.*;
import java.awt.event.*;
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;

class app extends Frame
{
    Label l1,l2,l3;
    Checkbox c1,c2,c3;
    public app()
    {
        super("mukesh");
        setSize(1000,600);
        setLayout(null);
        setVisible(true);

        c1=new Checkbox("c program");
        c1.setBounds(10,50,250,30);
        c2=new Checkbox("c++ program");
        c2.setBounds(10,100,250,30);
        c3=new Checkbox("java program");
        c3.setBounds(10,150,250,30);

        l1=new Label("not selected");
        l1.setBounds(300,50,600,30);
        l2=new Label("not selected");
        l2.setBounds(300,100,600,30);
        l3=new Label("not selected");
        l3.setBounds(300,150,600,30);

        c1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged (ItemEvent e)
            {
                l1.setText((e.getStateChange()==1?"checked":"unchecked"));
            }
        });

        c2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged (ItemEvent e)
            {
                l2.setText((e.getStateChange()==1?"checked":"unchecked"));
            }
        });

        c3.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged (ItemEvent e)
            {
                l3.setText((e.getStateChange()==1?"checked":"unchecked"));
            }
        });

        add(c1);
        add(c2);
        add(c3);
        add(l1);
        add(l2);
        add(l3);
        //close button
        this.addWindowListener(new WindowAdapter()
        {
        public void windowClosing(WindowEvent we )
        {
            System.exit(0);
        }
        });
    }
}
public class checkbox_002 {
    public static void main(String[] args)
    {
        app i=new app();

    }
}
