import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Task6 extends JFrame implements ActionListener
{
    int i=0;
    final JButton button;
    final JButton button2;
        JLabel label;
    Task6()
    {
        setSize(250,100);
        setTitle("card");
        setLocation(100,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setLayout(new FlowLayout());

        button =new JButton("+");
        button.addActionListener(this);
        button.setActionCommand("+");
        getContentPane().add(button);
        
        label=new JLabel("1");
        getContentPane().add(label);

        button2 =new JButton("-");
        button2.addActionListener(this);
        button2.setActionCommand("-");
        getContentPane().add(button2);


    }
    public void actionPerformed(ActionEvent e)
    {
        JButton button=(JButton) e.getSource();
        if(button.getActionCommand().equals("+"))
        {
            i++;
            label.setText("" +i);
        }
        else
        {
            i--;
            label.setText(""+i);
        }
    }
    public static void main(String[] args) 
    {
        Task6 app=new Task6();
        app.setVisible(true);
    }
}
