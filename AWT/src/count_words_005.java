import org.omg.PortableInterceptor.ServerRequestInfo;

import java.awt.*;
import java.awt.event.*;
class areas extends Frame implements ActionListener
{
    TextArea t;
    Label l1,l2;
    Button b;
    areas() {
        super("word count");
        setSize(1000, 600);
        setLayout(null);
        setVisible(true);

        l1=new Label("---");
        l1.setBounds(20,30,200,20);
        l2=new Label("---");
        l2.setBounds(20,60,200,20);

        t=new TextArea(10,30);
        t.setBounds(20,100,300,200);

        b=new Button("get count");
        b.setBounds(20,320,100,30);
        b.addActionListener(this);

        add(l1);
        add(l2);
        add(b);
        add(t);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });

    }
    public void actionPerformed(ActionEvent actionEvent)
    {
        String text=t.getText();
        String word[]=text.split("\\s");
        l1.setText("words      :"+word.length);
        l2.setText("character  :"+text.length());
    }
}
public class count_words_005 {
    public static void main(String args[])
    {
        areas i=new areas();
    }
}

