import java.awt.*;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.*;
class Task3 extends JFrame implements ActionListener
{
  JTextField first;
  JTextField second;
  JTextField third;
  JTextField forth;
  JLabel answer;
  public Task3()
  {
    setTitle("Biggest");
    setSize(240,180);
    setDefaultCloseOperation(3);

    setLayout(new BorderLayout());

    ((JComponent)getContentPane()).setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

    final JButton top = new JButton("Calculate");
    getContentPane().add(top,BorderLayout.PAGE_START);
    top.addActionListener(this);

    JPanel center =  new JPanel(new GridLayout(2,2));
    getContentPane().add(center,BorderLayout.CENTER);

    first = new JTextField("1" , 2);      //If u set Already dont call JTextField for this case
    center.add(first);

    second = new JTextField("2" , 2);
    center.add(second);

    third = new JTextField("3" , 2);
    center.add(third);

    forth = new JTextField("4" , 2);
    center.add(forth);

    JPanel bottom =  new JPanel(new BorderLayout());
    getContentPane().add(bottom,BorderLayout.PAGE_END);

    answer = new JLabel("?");
    answer.setHorizontalAlignment(JLabel.CENTER);
    bottom.add(answer);
  }
  public void actionPerformed(ActionEvent e)
  {
      int number1 = Integer.parseInt(first.getText());    //7 1,2,3,4
      int number2 = Integer.parseInt(second.getText());   //4
      int number3 = Integer.parseInt(third.getText());    //12
      int number4 = Integer.parseInt(forth.getText());    //3
      int soda [] = {number1,number2,number3,number4};
      int num1 = soda[0];
      for (int i = 0; i < soda.length; i++)
      {
        if (soda[i] >= num1)
        {
          num1 = soda[i];
        }
      }
      String text1 = String.valueOf(num1);
      answer.setText("Biggest is " + text1);
  }
  //String text1 = String.valueOf(number1); Valueof is Change everything to string
  public static void main(String[] args)
  {
    Task3 app = new Task3();
    app.setVisible(true);
  }
}