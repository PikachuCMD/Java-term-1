import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Task5 extends JFrame implements ActionListener
{
    Task5(){
        setSize(300,100);
        setLocation(200,200);
        setLayout(new FlowLayout());
        
       

        JButton button=new JButton("red");
        button.addActionListener(this);
        button.setActionCommand("red");
        getContentPane().add(button);
        
        JLabel label =new JLabel("   ");
        getContentPane().add(label);
        JButton button1=new JButton("blue");
        button1.addActionListener(this);
        button1.setActionCommand("blue");
        getContentPane().add(button1);

        JButton button2=new JButton("yellow");
        button2.addActionListener(this);
        button2.setActionCommand("yellow");
        getContentPane().add(button2);

        JButton button3=new JButton("green");
        button3.addActionListener(this);
        button3.setActionCommand("green");
        getContentPane().add(button3);
        

    }
    public void actionPerformed(ActionEvent e)
    {
        JButton button =(JButton) e.getSource();

        if(button.getActionCommand().equals("red"))
        {
            getContentPane().setBackground(Color.RED);
        }
        else if(button.getActionCommand().equals("blue"))
        {
            getContentPane().setBackground(Color.BLUE);
        }
        else if(button.getActionCommand().equals("yellow"))
        {
            getContentPane().setBackground(Color.YELLOW);
        }
        else
        {
            getContentPane().setBackground(Color.GREEN);
        }
    }
    public static void main(String[] args) {
        Task5 app=new Task5();
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
