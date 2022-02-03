import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Task001 extends JFrame implements ActionListener {
  final JTextField topField;
  final JButton a1,a2,a3,a4,a5,a6,a7,a8,a9,a0,b1,b2,c1,c2,c3,c4; 
  JLabel label;

  public Task001()
   {
    setTitle("Fraction Calculator");
    setSize(250, 290);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    setLayout(new BorderLayout());
   
    JPanel window=new JPanel(new GridLayout(2,1,10,0));
    getContentPane().add(window,BorderLayout.PAGE_START);


    topField =new JTextField("0_",1);
    window.add(topField);

    label=new JLabel("0");
    getContentPane().add(label,BorderLayout.PAGE_END);

    JPanel panel=new JPanel(new FlowLayout());
    window.add(panel);

    JPanel panel1 =new JPanel(new GridLayout(4,1));
    panel.add(panel1);
    
    a1=new JButton("1");
    a1.addActionListener(this);
    a1.setActionCommand("1");
    panel1.add(a1);

    a4=new JButton("4");
    panel1.add(a4);
    a4.addActionListener(this);
    a4.setActionCommand("4");

    a7=new JButton("7");
    panel1.add(a7);
    a7.addActionListener(this);
    a7.setActionCommand("7");

    b1=new JButton("*");
    panel1.add(b1);
    b1.addActionListener(this);
    b1.setActionCommand("*");

    JPanel panel2=new JPanel(new GridLayout(4,1));
    panel.add(panel2);

    a2=new JButton("2");
    panel2.add(a2);
    a2.addActionListener(this);
    a2.setActionCommand("2");

    a5=new JButton("5");
    panel2.add(a5);
    a5.addActionListener(this);
    a5.setActionCommand("5");

    a8=new JButton("8");
    panel2.add(a8);
    a8.addActionListener(this);
    a8.setActionCommand("8");

    a0=new JButton("0");
    panel2.add(a0);
    a0.addActionListener(this);
    a0.setActionCommand("0");
    JPanel panel3=new JPanel(new GridLayout(4,1));
    panel.add(panel3);

    a3=new JButton("3");
    panel3.add(a3);
    a3.addActionListener(this);
    a3.setActionCommand("3");

    a6=new JButton("6");
    panel3.add(a6);
    a6.addActionListener(this);
    a6.setActionCommand("6");

    a9=new JButton("9");
    panel3.add(a9);
    a9.addActionListener(this);
    a9.setActionCommand("9");

    b2=new JButton(".");
    panel3.add(b2);
    b2.addActionListener(this);
    b2.setActionCommand(".");

    JPanel panel4=new JPanel(new GridLayout(4,1));
    panel.add(panel4);

    c1=new JButton("+");
    panel4.add(c1);
    c1.addActionListener(this);

    c2=new JButton("-");
    panel4.add(c2);
    c2.addActionListener(this);
    c2.setActionCommand("-");

    c3=new JButton("/");
    panel4.add(c3);
    c3.addActionListener(this);
    c3.setActionCommand("/");

    c4=new JButton("Enter");
    panel4.add(c4);
    c4.addActionListener(this);
    c4.setActionCommand("Enter");   
  }

  public void actionPerformed(ActionEvent e) 
  {
    //String z=topField.getText();
      JButton x=(JButton) e.getSource();
      int y=Integer.parseInt(topField.getText());

    if(x.getActionCommand().equals("1"))
    {
        label.setText(""+topField.getText()+"1");
    }
    if(x.getActionCommand().equals("2"))
    {
        label.setText(""+topField.getText()+"2");
    }
    if(x.getActionCommand().equals("3"))
    {
        label.setText(""+topField.getText()+"3");
    }

     if(x.getActionCommand().equals("4"))
    {
        label.setText(""+topField.getText()+"4");
    }
    if(x.getActionCommand().equals("5"))
    {
        label.setText(""+topField.getText()+"5");
    }
    if(x.getActionCommand().equals("6"))
    {
        label.setText(""+topField.getText()+"6");
    }
    if(x.getActionCommand().equals("7"))
    {
        label.setText(""+topField.getText()+"7");
    }
    if(x.getActionCommand().equals("8"))
    {
        label.setText(""+topField.getText()+"8");
    } 
    if(x.getActionCommand().equals("9"))
    {
        label.setText(""+topField.getText()+"9");
    }
     if(x.getActionCommand().equals("0"))
    {
        label.setText(""+topField.getText()+"0");
    }
    if(x.getActionCommand().equals("*"))
    {
        label.setText(""+topField.getText()+"*");
    }
    if(x.getActionCommand().equals("."))
    {
        label.setText(""+topField.getText()+".");
    }
    if(x.getActionCommand().equals("+"))
    {
        label.setText(""+topField.getText()+"+");
    }
    if(x.getActionCommand().equals("-"))
    {
        label.setText(""+topField.getText()+"-");
    }
    if(x.getActionCommand().equals("/"))
    {
        label.setText(""+topField.getText()+"/");
    }
    if(x.getActionCommand().equals("Enter"))
    {
        label.setText(""+y);
    }
  }
  public static void main(String[] args) 
  {
    Task001  app = new Task001();
    app.setVisible(true);
  }
}