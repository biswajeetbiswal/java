import java.awt.*;
public class AwtEvent extends Frame
{
    AwtEvent()
    {
        Button b=new Button("Click me");
        b.setBounds(30,100,80,30);
        add(b);
        setSize(300,300);
        setTitle("This is our Awt example");
        setLayout(null);
        setVisible(true);
    }
    public static void main(String args[])
    {
        AwtEvent f=new AwtEvent();
    }
}