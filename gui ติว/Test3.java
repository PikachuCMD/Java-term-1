import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Test3 extends JFrame implements ActionListener // Task5
{
   JLabel re;
   JLabel b;

   public Test3() {

      setTitle("My Application");
      setSize(300, 200);
      setLocation(10, 200);

      setLayout(new FlowLayout());
      final JLabel label = new JLabel("Hello Mor Nor");
      getContentPane().add(label);

      final JButton button = new JButton("Yes Flash");
      getContentPane().add(button);
      button.addActionListener(this);

      final JButton ok = new JButton("kub");
      ok.setActionCommand("x");
      getContentPane().add(ok);
      ok.addActionListener(this);

      b = new JLabel();
      getContentPane().add(b);
      // setLayout(new FlowLayout());

   }

   public void actionPerformed(ActionEvent e) {
      JButton oj = (JButton) e.getSource();
      if (oj.getActionCommand().equals("x")) {
         b.setText("progremming");
      } else {
         b.setText("kide");
      }
   }

   public static void main(String[] args) {
      Test3 pp = new Test3();
      pp.setTitle("Hello GUI ");
      pp.setSize(500, 200);
      pp.setLocation(10, 200);
      pp.setVisible(true);
      pp.setDefaultCloseOperation(3);
   }

}