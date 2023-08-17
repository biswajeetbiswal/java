import java.awt.*;
import java.awt.event.*;
//first step
public class Action implements ActionListener{
    public static void main(String args[])
    {
        Frame f=new Frame("Action listener");
        final TextField tf= new TextField();
        tf.setBounds(50,50,150,20);
        Button b=new Button("Click here");
        b.setBounds(50,100,60,30);
        //second step
        b.addActionListener(this);
        f.add(b);
        f.add(tf);
        f.setSize(400,400);
        f.setLayout(null);
        f.setvisible(true);
    }
    //third step
    public void actionPerformed(ActionEvent e){
        tf.setText("Welcome to Javapoint.");
    }
}