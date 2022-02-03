import java.awt.*;
import javax.swing.JFrame;
import javax.swing.border.Border;
import javax.swing.*;
import java.awt.event.*;
class Task3 extends JFrame implements ActionListener
{
   JTextField a;
   JTextField b;
   JTextField c;
   JTextField d;
   JLabel label;
  public Task3()
  {
    setTitle("Biggest");
    setSize(240,180);
    setDefaultCloseOperation(3);

    setLayout(new BorderLayout());

    ((JComponent)getContentPane()).setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

    JButton button =new JButton("Calcoter");
    getContentPane().add(button,BorderLayout.PAGE_START);
    button.addActionListener(this);
    button.setActionCommand("+");

    JPanel panel=new JPanel(new GridLayout(2,2));
    getContentPane().add(panel,BorderLayout.CENTER);

    a=new JTextField("");
    panel.add(a);
   
    b=new JTextField("");
    panel.add(b);

    c=new JTextField("");
    panel.add(c);

    d=new JTextField("");
    panel.add(d);

    JPanel panel2=new JPanel(new BorderLayout());
    getContentPane().add(panel2 ,BorderLayout.PAGE_END);

    label =new JLabel("?");
    label.setHorizontalAlignment(JLabel.CENTER);
    panel2.add(label);
  }
  public void actionPerformed(ActionEvent e)
  {
    JButton button=(JButton) e.getSource();
    int[] x=new int[4];
    x[0]=Integer.parseInt(a.getText());
    x[1]=Integer.parseInt(b.getText());
    x[2]=Integer.parseInt(c.getText());
    x[3]=Integer.parseInt(d.getText());

    int max=x[0];
    if(button.getActionCommand().equals("+"))
    {
        for(int i=0;i<x.length;i++)
        {
            if(max<x[i])
            {
                max=x[i];
            }
        }
    label.setText(""+max);
    }

  }
  public static void main(String[] args)
  {
    Task3 app = new Task3();
    app.setVisible(true);
  }
}