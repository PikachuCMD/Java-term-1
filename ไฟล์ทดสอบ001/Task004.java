import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
class Task004 extends JFrame //implements ActionListener // Task5
{
     
  public Task004()
  {
     
    setTitle("My Application");
    setSize(300,200);
    setLocation(10,200);
    
    setLayout(new GridLayout(2,1));

    JLabel label=new JLabel("LabelA");
    label.setHorizontalAlignment(JLabel.CENTER);
    getContentPane().add(label,BorderLayout.CENTER);

    JPanel panel =new JPanel(new GridLayout(1,2));
    getContentPane().add(panel);

    JButton button=new JButton("ButtonA");
    panel.add(button);

    JButton button2=new JButton("ButtonB");
    panel.add(button2);
     
      }
  

  public static void main(String[] args)
  {
         Task004 pp = new Task004();
         pp.setTitle("Hello GUI ");
         pp.setSize(500,200);
         pp.setLocation(10,200);
         pp.setVisible(true);
         pp.setDefaultCloseOperation(3);
   }

}

