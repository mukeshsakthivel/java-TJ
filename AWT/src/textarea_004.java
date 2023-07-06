import java.awt.*;
import java.awt.event.*;
class area extends Frame implements ActionListener
{
    TextArea t;
    Label l;
    Button b;
    TextField tf;
    area()
    {
        super("textfiels");
        setSize(1000,600);
        setLayout(null);
        setVisible(true);

        l=new Label("---");
        l.setBounds(20,50,100,30);

        tf=new TextField(2);
        tf.setBounds(20,350,300,30);

        t=new TextArea(10,30);//row coloum
        t.setBounds(20,100,300,200);

        b=new Button("click");
        b.setBounds(20,400,100,30);
        b.addActionListener(this);

        add(l);
        add(tf);
        add(t);
        add(b);


        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent actionEvent) {
        //l.setText(t.getSelectedText());//selected text only to place it
        //t.append(tf.getText());//the textfied text to send the textarea
        t.insert(tf.getText(),t.getCaretPosition());//cursor placing it past

    }
}

public class textarea_004 {
    public static void main(String args[])
    {
        area i=new area();
    }
}


