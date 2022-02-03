import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Task1 extends JFrame implements ActionListener
{
    JButton plus;
    JButton min;
    JLabel num;
    int i=1;

    public Task1()
    {
        setTitle("Window");
        setSize(500,500);
        setDefaultCloseOperation(3);

        plus = new JButton("+");
        plus.setActionCommand("+");
        plus.addActionListener(this);

        min = new JButton("-");
        min.setActionCommand("-");
        min.addActionListener(this);

        num = new JLabel(""+i);

        setLayout(new FlowLayout());

        getContentPane().add(min);
        getContentPane().add(num);
        getContentPane().add(plus);
    }
    public void actionPerformed(ActionEvent e)
    {
        JButton abt = (JButton) e.getSource();
        if(abt.getActionCommand().equals("+"))
        {
            i++;
            num.setText(""+i);
        }
        else
        {
            i--;
            num.setText(""+i);
        }
    }
    public static void main(String[] args) 
    {
        Task1 app = new Task1();
        app.setVisible(true);
    }

}