import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Test2 extends JFrame implements ActionListener // Task5
{
  public Test2()
  {
    setTitle("My Application");
    setSize(300,200);
    setLocation(10,200);

    setLayout(new FlowLayout());
    final JLabel label = new JLabel("Hello Mor Nor");
    getContentPane().add(label);

    final JButton button = new JButton("Yes Flash");
    getContentPane().add(button);
    button.addActionListener(this);

  }
  public void actionPerformed(ActionEvent e)
  {
     System.out.println("What do you call?");
  }


  public static void main(String[] args)
  {
         Test2 pp = new Test2();
         pp.setTitle("Hello GUI ");
         pp.setSize(500,200);
         pp.setLocation(10,200);
         pp.setVisible(true);
         pp.setDefaultCloseOperation(3);
   }

}